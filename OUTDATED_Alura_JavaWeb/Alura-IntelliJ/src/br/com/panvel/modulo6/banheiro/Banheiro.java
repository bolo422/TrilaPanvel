package br.com.panvel.modulo6.banheiro;

public class Banheiro {
    private boolean estaSujo = true;

    public void usarBanheiro() {
        String nome = Thread.currentThread().getName();
        System.out.println(nome + " está batendo na porta");

        synchronized (this) {
            System.out.println(nome + " entrou no banheiro");
            while (estaSujo) {
                System.out.println(nome + ": o banheiro esta sujo, vou esperar");
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(nome + " começou a usar o banheiro");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            estaSujo = true;
            System.out.println(nome + " terminou de usar o banheiro");
            System.out.println(nome + " saiu do banheiro");
        }
    }

    public void limpaBanheiro() {
        String nome = Thread.currentThread().getName();
        System.out.println(nome + " está batendo na porta");

        synchronized (this) {
            System.out.println(nome + " entrou no banheiro");
            if (!estaSujo) {
                System.out.println(nome + ": o banheiro está limpo, volto depois");
                return;
            }
            System.out.println(nome + " começou a LIMPAR o banheiro");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            estaSujo = false;
            System.out.println(nome + " terminou de LIMPAR o banheiro");
            System.out.println(nome + " saiu do banheiro");
            notifyAll();
        }
    }
}


