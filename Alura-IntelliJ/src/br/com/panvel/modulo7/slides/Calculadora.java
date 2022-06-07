package br.com.panvel.modulo7.slides;

public class Calculadora{
    public static Integer somaLenta(Integer a, Integer b)
    {
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a + b;
    }
}
