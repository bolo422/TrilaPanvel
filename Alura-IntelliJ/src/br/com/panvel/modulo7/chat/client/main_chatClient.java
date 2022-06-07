package br.com.panvel.modulo7.chat.client;

import br.com.panvel.modulo7.chat.MessageUtil;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ConnectException;
import java.net.Socket;
import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class main_chatClient {
    public static void main(String[] args){

        Client client = new Client();

        try {

            client.run();

        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }

    }
}

class Client{

    volatile String name;
    Socket socket;
    List<String> logMessages;
    BlockingQueue<String> messagesQueue;

    Client()
    {
        name = null;
        socket = null;
        logMessages = Collections.synchronizedList(new ArrayList<>());
        messagesQueue = new ArrayBlockingQueue<>(10);
    }

    void run() throws IOException, InterruptedException {


        connect();

        System.out.println("Connected to server " + socket);

        Thread sendMessage = new Thread(new SendMessage(socket, name, messagesQueue));

        Thread receiveMessage = new Thread(new ReceiveMessage(socket, messagesQueue));

        Thread printMessage = new Thread(new PrintMessage(messagesQueue));

        sendMessage.start();
        printMessage.start();
        receiveMessage.start();

        try {
            sendMessage.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Closing client socket");
        socket.close();
    }

    private void connect() throws IOException, InterruptedException {
        while (socket == null){
            try{
                socket = new Socket("localhost", 44000);
            }
            catch (ConnectException ex)
            {
                System.out.println("Nenhum servidor encontrado em: localhost:44000");
            }
            Thread.sleep(1000);
        }
    }
}


class SendMessage implements Runnable
{
    Socket socket;
    String name;
    BlockingQueue<String> messagesQueue;

    SendMessage(Socket socket, String name, BlockingQueue<String> messagesQueue)
    {
        this.socket = socket;
        this.name = name;
        this.messagesQueue = messagesQueue;
    }


    @Override
    public void run() {
        try {
            PrintStream message = new PrintStream(
                    socket.getOutputStream());

            Scanner input = new Scanner(System.in);
            System.out.println("[Chat Settings] Digite o NOME desejado (será visível a outros usuários):");
            while (input.hasNextLine()) {
                String inputStr = input.nextLine();

                message.println(inputStr);

                if(Objects.equals(inputStr, "/exit"))
                    break;

                if(name == null)
                {
                    name = "C:" + inputStr;
                    continue;
                }
                messagesQueue.put(MessageUtil.formatMessage(name, inputStr));
            }

            message.close();
            input.close();

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class ReceiveMessage implements Runnable
{
    Socket socket;
    BlockingQueue<String> messagesQueue;

    ReceiveMessage(Socket socket, BlockingQueue<String> messagesQueue) {
        this.socket = socket;
        this.messagesQueue = messagesQueue;
    }

    @Override
    public void run() {
        try {
            Scanner serverInput = new Scanner(
                    socket.getInputStream());

            while (serverInput.hasNextLine()) {
                String serverMessage = serverInput.nextLine();

                messagesQueue.put(serverMessage);
            }

            serverInput.close();

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class PrintMessage implements Runnable
{
    Socket socket;
    BlockingQueue<String> messagesQueue;

    PrintMessage(BlockingQueue<String> messagesQueue) {
        this.messagesQueue = messagesQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(messagesQueue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
