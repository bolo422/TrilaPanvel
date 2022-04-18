package br.com.panvel.excecoes.stack;

class Conta{
    public int numero;
}

public class Main_stack {
    public static void main(String[] args) {
        System.out.println("Inicio do Main");

        try {

            TesteNull();
            TesteArithmetic();

        }
        catch (ArithmeticException | NullPointerException e)
        {
            e.printStackTrace();
        }

        System.out.println("Fim do Main");

    }


    static void TesteNull() throws NullPointerException{
        Conta c = null;
        System.out.println(c.numero);
    }

    static void TesteArithmetic(){
        int t = 1/0;
    }

}

