package br.com.panvel.modulo6.banheiro;

public class teste_banheiro {
    public static void main(String[] args) {

        Banheiro banheiro = new Banheiro();
        Thread conv1 = new Thread(new Convidado(banheiro), "Erick");
        Thread conv2 = new Thread(new Convidado(banheiro), "Rafael");
        Thread limpeza = new Thread(new Limpeza(banheiro), "Limpeza");

        limpeza.setDaemon(true);

        conv1.start();
        conv2.start();

        limpeza.setPriority(Thread.MIN_PRIORITY);
        limpeza.setPriority(Thread.NORM_PRIORITY);
        limpeza.setPriority(Thread.MAX_PRIORITY);
        limpeza.setPriority(6);

        limpeza.start();




    }
}
