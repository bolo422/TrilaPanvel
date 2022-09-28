package br.com.panvel.modulo7.slides;

import java.util.concurrent.*;

public class test_future {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool(r -> {
            Thread t = new Thread(r);
            t.setUncaughtExceptionHandler(new ExceptionHandler());
            return t;   });
        Servidor servidor = new Servidor();
        while (servidor.estaRodando)
        {
            servidor.aguardandoConexao();
            Future<Integer> future1 = cachedThreadPool.submit(()->Calculadora.somaLenta(5,5));

            cachedThreadPool.execute(()-> {
                try {
                    System.out.println(future1.get());
                }
                catch (InterruptedException | ExecutionException e) {
                    future1.cancel(true);
                    throw  new RuntimeException();
                }
            });
        }
        cachedThreadPool.shutdown();
    }
}

class Cal implements Callable<Void>
{
    @Override
    public Void call() throws Exception {
        int abc = 123;
        return null;
    }
}

class RecebeFuture implements Runnable
{
    Future<Integer> future;

    RecebeFuture(Future<Integer> future)
    {
        this.future = future;
    }

    @Override
    public void run() {
        try {
            Integer numeroMagico = future.get(120, TimeUnit.SECONDS);
            System.out.println(numeroMagico);
        }
        catch (InterruptedException | ExecutionException | TimeoutException e) {throw new RuntimeException(e);}
    }
}

