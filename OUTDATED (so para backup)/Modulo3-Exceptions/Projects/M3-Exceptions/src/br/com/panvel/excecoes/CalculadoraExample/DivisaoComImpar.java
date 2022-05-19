package br.com.panvel.excecoes.CalculadoraExample;

public class DivisaoComImpar extends Exception {
    DivisaoComImpar(String message)
    {
        super(message);
    }
    DivisaoComImpar()
    {
        super("Todos os números devem ser pares!");
    }
}
