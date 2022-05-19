package br.com.panvel.modulo3.excecoes;

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
