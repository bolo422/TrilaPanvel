package br.com.panvel.modulo3.excecoes;

public class DivisaoPorZero extends RuntimeException {
    DivisaoPorZero(String message)
    {
        super(message);
    }
    DivisaoPorZero()
    {
        super("Não pode dividir por zero!");
    }



}
