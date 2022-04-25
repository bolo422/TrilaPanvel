package br.com.panvel.excecoes.CalculadoraExample;

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
