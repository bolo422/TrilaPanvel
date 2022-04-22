package br.com.panvel.excecoes.trycatchfinally;

public class MainTryCatchFinally {
    public static void main (String[] args)
    {
        // Try Catch

        System.out.println("Inicio do Main");

        try
        {
            System.out.println("Inicio do Try");

            int i = 5/0;

            System.out.println("Fim do Try");
        }
        catch (Exception ex)
        {
            System.out.println("Catch");
        }

        System.out.println("Fim do Main");


        // Try Catch Finally
        /*
        System.out.println("Inicio do Main");
        try
        {
            System.out.println("Inicio do Try");

            System.out.println("Fim do Try");
        }
        catch (Exception ex)
        {
            System.out.println("Catch");
        }
        finally {
            System.out.println("Finally");
        }
        System.out.println("Fim do Main");
         */
    }
}
