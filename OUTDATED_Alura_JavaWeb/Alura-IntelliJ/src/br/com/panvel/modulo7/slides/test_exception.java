package br.com.panvel.modulo7.slides;

public class test_exception {
    public static void main(String[] args) {
        System.out.println("main - ini");
        Thread thread = new Thread(new ThrowExcpetion());

        thread.setUncaughtExceptionHandler(new ExceptionHandler());

        thread.start();
        System.out.println("main - end");
    }
}

class ExceptionHandler implements Thread.UncaughtExceptionHandler
{
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("Exception in " + t.getName() +
                ": " + e.getMessage());
    }
}

class ThrowExcpetion implements Runnable
{
    @Override
    public void run() {
        Thread.currentThread().setUncaughtExceptionHandler(new ExceptionHandler());
        throw new RuntimeException("Runtime Excpetion!");
    }

    ThrowExcpetion()
    {
        Thread.currentThread().setUncaughtExceptionHandler(new ExceptionHandler());
    }
}



/////////// SLIDE !!!!!!!

class  xxxxxxxxxxslideExceptionHandler
{
    void m2()
    {
        try{
            throw new RuntimeException();
        }
        catch (RuntimeException ex)
        {ex.printStackTrace();}
    }

    void m1()
    {
        throw new RuntimeException();
    }
}

