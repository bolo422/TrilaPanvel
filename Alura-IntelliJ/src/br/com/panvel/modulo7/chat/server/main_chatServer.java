package br.com.panvel.modulo7.chat.server;



import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import br.com.panvel.modulo7.chat.MessageUtil;

public class main_chatServer {
    public static void main(String[] args) throws Exception {

        System.out.println("Server Start");
        ServerSocket server = new ServerSocket(44000);
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        Set<Socket> clients = Collections.synchronizedSet(new HashSet<>());

        while (true) {
            Socket accept = server.accept();
            System.out.println("Receiving connection from " + accept.getPort());
            cachedThreadPool.execute(new Chat(accept, clients));
            clients.add(accept);

            System.out.println("Client added to set:");
            clients.forEach(c-> System.out.println("["+c.getPort()+"],"));

        }
    }
}

class Chat implements Runnable{
    private Socket socket;
    private Set<Socket> clients;
    private String name;

    Chat(Socket s, Set<Socket> c){socket = s; clients = c;}
    @Override
    public void run() {

        try (Scanner clientInput = new Scanner(socket.getInputStream())) {
            sendToAll(clientInput);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Closing socket " + socket.getPort());
        clients.remove(socket);

        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void sendToAll(Scanner clientInput) throws IOException, InterruptedException {
        Set<PrintStream> clientsOutput = updateClientsOutput();

        while (clientInput.hasNextLine())
        {
            if(name == null)
            {
                name = clientInput.nextLine();
                continue;
            }

            String message = clientInput.nextLine();

            if(Objects.equals(message, "/exit"))
            {
                break;
            }

            message = MessageUtil.formatMessage(name, message);
            clientsOutput = updateClientsOutput();
            for (PrintStream c: clientsOutput) {
                c.println(message);
            }
        }

        clientsOutput.forEach(PrintStream::close);

    }

    private Set<PrintStream> updateClientsOutput()
    {
        Set<PrintStream> result = new HashSet<>();
        for(Socket c : clients)
        {
            try {
                if(c == socket)
                    continue;

                result.add(new PrintStream(c.getOutputStream()));

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return result;
    }

}