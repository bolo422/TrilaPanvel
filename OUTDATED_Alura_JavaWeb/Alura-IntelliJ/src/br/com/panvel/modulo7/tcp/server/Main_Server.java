package br.com.panvel.modulo7.tcp.server;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main_Server {

    public static void main(String[] args) throws Exception {

        System.out.println("Server Start");
        ServerSocket server = new ServerSocket(44000);
        ExecutorService FixedThreadPool = Executors.newFixedThreadPool(5);
        ExecutorService CachedThreadPool = Executors.newCachedThreadPool();

        while (true) {
            Socket accept = server.accept();
            System.out.println("Receiving connection from " + accept.getPort());
            FixedThreadPool.execute(new Command(accept));
        }
    }
}

class Command implements Runnable{
    private Socket socket;
    Command(Socket s){socket = s;}
    @Override
    public void run() {
        try {
            Scanner message = new Scanner(socket.getInputStream());
            while (message.hasNextLine())
            {
                switch (message.nextLine())
                {
                    case "c1":
                        System.out.println(socket.getPort() + "-> ini: Command 1 (c1)");
                        Thread.sleep(15000);
                        System.out.println(socket.getPort() + "-> end: Command 1 (c1)");
                        break;
                    case "c2":
                        System.out.println(socket.getPort() + "-> ini: Command 2 (c2)");
                        Thread.sleep(15000);
                        System.out.println(socket.getPort() + "-> end: Command 2 (c2)");
                        break;
                    case "c3":
                        System.out.println(socket.getPort() + "-> ini: Command 3 (c3)");
                        Thread.sleep(15000);
                        System.out.println(socket.getPort() + "-> end: Command 3 (c3)");
                        break;
                    default:
                        System.out.println(socket.getPort() + "-> Invalid command");
                        break;
                }
            }
            message.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}


