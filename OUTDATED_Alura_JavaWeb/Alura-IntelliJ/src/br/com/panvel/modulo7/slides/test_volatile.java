package br.com.panvel.modulo7.slides;

import java.util.concurrent.atomic.AtomicBoolean;

public class test_volatile{
    public static void main(String[] args) throws InterruptedException {
        ServidorDeTeste servidor = new ServidorDeTeste();
        servidor.rodar();
        servidor.alterandoAtributo();
    }
}

/*  RESULTADO ESPERADO:

Servidor começando, estaRodando = false
Main alterando estaRodando = true
Servidor rodando, estaRodando = true
Main alterando estaRodando = false
Servidor terminando, estaRodando = false        */

class ServidorDeTeste {

    //boolean estaRodando = false;
    //volatile boolean estaRodando = false;
    AtomicBoolean estaRodando = new AtomicBoolean(false);

    void rodar() {
        new Thread(new Runnable() {

            public void run() {
                System.out.println("Servidor começando, estaRodando = " + estaRodando );

                while(!estaRodando.get()) {}

                System.out.println("Servidor rodando, estaRodando = " + estaRodando );

                while(estaRodando.get()) {}

                System.out.println("Servidor terminando, estaRodando = " + estaRodando );
            }
        }).start();
    }

    void alterandoAtributo() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Main alterando estaRodando = true");
        estaRodando.set(true);

        Thread.sleep(1000);
        System.out.println("Main alterando estaRodando = false");
        estaRodando.set(false);
    }
}


