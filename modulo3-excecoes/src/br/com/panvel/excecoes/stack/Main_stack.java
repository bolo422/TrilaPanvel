package br.com.panvel.excecoes.stack;

public class Main_stack {
    public static void main(String[] args) {
        System.out.println("Inicio do Main");
        Metodo1();
        System.out.println("Fim do Main");
    }

    static void Metodo1(){
        System.out.println("Inicio Método 1");

        try {
            Metodo2();
        }
        catch (Exception e)
        {
            // tratar exception
        }
        System.out.println("Fim Método 1");
    }

    static void Metodo2(){
        System.out.println("Inicio Método 2");

        int test = 5/0;

        System.out.println("Fim Método 2");
    }
}

