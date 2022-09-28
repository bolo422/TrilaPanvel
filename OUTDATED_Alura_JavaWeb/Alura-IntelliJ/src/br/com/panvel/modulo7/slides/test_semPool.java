package br.com.panvel.modulo7.slides;

import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class test_semPool {
    public static void main(String[] args) {

        Servidor servidor = new Servidor();

        while (servidor.estaRodando)
        {
            //Socket cliente = servidor.aguardandoConexao();

            //new Thread(new Tarefa());
        }
    }
}


