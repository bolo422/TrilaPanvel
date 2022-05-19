package br.com.panvel.modulo6.banheiro;

public class Convidado implements Runnable {
    private Banheiro banheiro;

    public Convidado(Banheiro banheiro) {
        this.banheiro = banheiro;
    }

    @Override
    public void run() {
        banheiro.usarBanheiro();
    }
}


