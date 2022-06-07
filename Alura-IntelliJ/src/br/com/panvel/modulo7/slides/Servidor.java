package br.com.panvel.modulo7.slides;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
    boolean estaRodando;
    ServerSocket server;
    Servidor()
    {
        estaRodando = true;
        try {
            server = new ServerSocket(44000);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void aguardandoConexao()
    {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
