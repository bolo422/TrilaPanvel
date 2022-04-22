package br.com.panvel.excecoes.slides.error;

public class MainError {
    public static void main (String[] args)
    {
        errorMethod();
    }

    static void errorMethod()
    {
        errorMethod();
    }
}
