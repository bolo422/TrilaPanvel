package br.com.panvel.excecoes.trycatchfinally;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TryWithResources {
    public static void main (String[] args)
    {
        String line = null;

        try(FileReader fileReader = new FileReader("test.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);){

            while((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }
        }
        catch (Exception ex)
        {
            System.out.println("File Not Found :(");

        }
        finally {


        }


    }
}


