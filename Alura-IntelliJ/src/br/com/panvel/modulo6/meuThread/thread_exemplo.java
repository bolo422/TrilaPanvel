package br.com.panvel.modulo6.meuThread;

import java.util.concurrent.ThreadLocalRandom;

public class thread_exemplo {
    public static void main(String[] args) {



        Thread t1 = new Thread(new R(), "Thread 1");

        Thread t2 = new Thread(()-> System.out.println("Threads!"), "Thread 2");



    }
}

class R implements Runnable
{
    @Override
    public void run() {
        // EXECUÇÃO DA THREAD
        System.out.println("Threads!");
    }
}

