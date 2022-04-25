package br.com.panvel.excecoes.trycatchfinally;

import java.io.BufferedReader;
import java.io.FileReader;

public class NestedTry {
    public static void main (String[] args)
    {
        try{

            int array[] = {1,2,3};

            try {
                array[5] = 10;
            }
            catch (ArrayIndexOutOfBoundsException ex)
            {
                System.out.println("index inválido");
            }
            System.out.println("Depois do nested try");
        }
        catch (Exception ex)
        {
            System.out.println("catch");
        }

        System.out.println("Fim do Main");

    }
}


