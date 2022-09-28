package br.com.panvel.modulo7.tcp.client;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Main_Client {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost", 44000);

        System.out.println("Connected to server " + socket);


        Thread sendMessage = new Thread(() -> {

            try {
                PrintStream message = new PrintStream(
                        socket.getOutputStream());

                Scanner input = new Scanner(System.in);

                while (input.hasNextLine()) {

                    String inputStr = input.nextLine();

                    if (inputStr.trim().equals("")) {
                        break;
                    }

                    message.println(inputStr);
                }

                message.close();
                input.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        Thread receiveMessage = new Thread(() -> {

            try {
                Scanner serverInput = new Scanner(
                        socket.getInputStream());

                while (serverInput.hasNextLine()) {

                    String serverMessage = serverInput.nextLine();
                    System.out.println(serverMessage);
                }

                serverInput.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        });

        sendMessage.start();
        receiveMessage.start();

        try {
            sendMessage.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Closing client socket");
        socket.close();
    }
}
