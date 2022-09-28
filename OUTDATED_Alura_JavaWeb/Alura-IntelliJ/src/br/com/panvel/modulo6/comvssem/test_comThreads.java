package br.com.panvel.modulo6.comvssem;

import java.math.BigInteger;

public class test_comThreads {
    public static void main(String[] args) {

        System.out.println("Sem Threads:");
        long inicio = System.currentTimeMillis();
        for (int i = 0; i < 5; i++) {
            calcula(inicio);
        }

        System.out.println("\n\nCom Threads:");
        inicio = System.currentTimeMillis();
        for (int i = 0; i < 5; i++) {
            long finalInicio = inicio;
            Thread t = new Thread(()->calcula(finalInicio));
            t.start();
        }

    }

    private static void calcula(long inicio)
    {
        long valor1 = 10000;
        long valor2 = 5000;
        BigInteger calculo = new BigInteger("0");

        for (int i = 0; i < valor1; i++) {
            for (int j = 0; j < valor2; j++) {
                calculo = calculo.add(new BigInteger("1"));
            }
        }
        long fim = System.currentTimeMillis();
        System.out.println("Tempo: " + (fim - inicio));
    }
}


