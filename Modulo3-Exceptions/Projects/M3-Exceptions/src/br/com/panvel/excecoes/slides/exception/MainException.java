package br.com.panvel.excecoes.slides.exception;

import java.io.IOError;
import java.io.IOException;

public class MainException {
    public static void main (String[] args)
    {
        try
        {
            checked_one();
        }
        catch (IOException ex)
        {

        }

        checked_two();
    }

    // Checked (Compile Time Excpetion) -> Precisa ser tratada em Compile Time
    // 1ª Forma: O método declara com a palavra reservada throws que ele possivelmente
    // causará esta exceção, então qualquer chamda a este método deve ter uma tratativa.
    static void checked_one() throws IOException
    {
        throw new IOException();
    }

    //2ª Forma: a própria implementação do método já trata a exceção.
    static void checked_two()
    {
        try
        {
            throw new IOException();
        }
        catch (IOException ex)
        {

        }
    }

    // Unchecked (Runtime Exception) -> O programa não sabe que ela pode acontecer, então
    // não é obrigatório ter uma tratativa em compile time, porém se
    // não for tratada, causará problemas em Runtime.
    static void unChecked()
    {
        throw new ArithmeticException();
    }

}
