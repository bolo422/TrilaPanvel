package br.com.panvel.modulo6.deadlock;

public class test_deadlock {
    public static void main(String[] args) {
        Garfo garfo = new Garfo();
        Faca faca = new Faca();

        new Thread(new Almocar(garfo, faca), "Almoco (GF)").start();
        new Thread(new Jantar(garfo, faca), "Janta (FG)").start();
    }
}

class Almocar implements Runnable
{

    private Garfo garfo;
    private Faca faca;

    public Almocar(Garfo garfo, Faca faca) {
        this.garfo = garfo;
        this.faca = faca;
    }

    @Override
    public void run() {
        String nome = Thread.currentThread().getName();
        synchronized (faca)
        {
            System.out.println(nome + " peguei a faca");
            synchronized (garfo)
            {
                System.out.println(nome + " peguei o garfo");
            }
        }


    }
}

class Jantar implements Runnable
{
    private Garfo garfo;
    private Faca faca;

    public Jantar(Garfo garfo, Faca faca) {
        this.garfo = garfo;
        this.faca = faca;
    }

    @Override
    public void run() {
        String nome = Thread.currentThread().getName();

        synchronized (faca)
        {
            System.out.println(nome + " peguei o faca");
            synchronized (garfo)
            {
                System.out.println(nome + " peguei a garfo");
            }
        }

    }
}

class Faca{}
class Garfo{}