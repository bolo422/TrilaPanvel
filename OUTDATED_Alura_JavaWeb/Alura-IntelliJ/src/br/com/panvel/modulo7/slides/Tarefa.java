package br.com.panvel.modulo7.slides;

import java.net.Socket;

public class Tarefa implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
