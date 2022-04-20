package br.com.panvel.excecoes.BasicExceptions;

public class MyUncheckedException extends RuntimeException {
    MyUncheckedException(String message)
    {
        super(message);
    }

}
