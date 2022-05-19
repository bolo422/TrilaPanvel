package br.com.panvel.modulo6.ordemDeExecucao;

public class test_ordem {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println(Thread.currentThread().getName() + " - " + i);
                }
            }
        };

        for (int i = 0; i < 3; i++) {
            new Thread(runnable).start();
        }
    }
}
