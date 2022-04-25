package br.com.panvel.excecoes.slides.stack;

class Conta{
    public int numero;
}

public class Main_stack {
    public static void main(String[] args) {
        System.out.println("Inicio do Main");
        try {
            System.out.println("Inicio do Try");
            TesteNull(false);
            TesteArithmetic(true);
            System.out.println("Fim do Try");
        }
        catch (NullPointerException | ArithmeticException e)
        {
            System.out.println(e + ": " + e.getMessage());
        }
        System.out.println("Fim do Main");

    }


    static void TesteNull(boolean b) {
        Conta c = null;
        if(b)
            System.out.println(c.numero);
    }

    static void TesteArithmetic(boolean b)
    {
        int t;
        if(b)
            t = 1/0;
    }

}

