package br.com.panvel.modulo7.client;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;

public class Main_Client {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost", 44000);

        System.out.println("Connected to server " + socket.toString());

        PrintStream message = new PrintStream(socket.getOutputStream());
        message.println("c1");

        message.close();
        socket.close();
    }
}
