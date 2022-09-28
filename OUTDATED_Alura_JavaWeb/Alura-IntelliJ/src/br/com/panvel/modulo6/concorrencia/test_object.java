package br.com.panvel.modulo6.concorrencia;

public class test_object {
    public static void main(String[] args) throws InterruptedException {

        Add synced = new Add();
        Add unsynced = new Add();

        for (int k = 0; k < 10; k++) {
            new Thread(new Execucao(synced, true)).start();
            new Thread(new Execucao(unsynced, false)).start();
        }

        Thread.sleep(5000);
        System.out.println("synced: " + synced);
        System.out.println("unsynced: " + unsynced);
    }
}

class Execucao implements Runnable
{
    Add add;
    boolean synced;
    Execucao(Add add, boolean synced)
    {
        this.add = add;
        this.synced = synced;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            if(synced)
                add.syncAdd();
            else
                add.unsyncAdd();
        }
    }
}

class Add
{
    private Integer integer;
    Add(){this.integer = 0;}

    public synchronized void syncAdd()
    {
        integer = integer + 1;
        // 20 = 20+1
        // wait
        // 21 = +1
    }

    public void unsyncAdd()
    {
        integer = integer + 1;
        // 20 = 20+1
        // 20 = 20+1
    }

    @Override
    public String toString() {
        return integer.toString();
    }
}
