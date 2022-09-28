package br.com.panvel.modulo7.slides;

import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class test_comPool {
    public static void main(String[] args){
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool(
                r -> {
                Thread t = new Thread(r);
                t.setUncaughtExceptionHandler(new ExceptionHandler());
                return t;   });

        Servidor servidor = new Servidor();
        while (servidor.estaRodando)
        {
            servidor.aguardandoConexao();
            cachedThreadPool.execute(new ThrowExcpetion());
        }
        cachedThreadPool.shutdown();
    }
}




