package br.com.panvel.modulo6.meuThread;

import java.math.BigInteger;

public class test_meuThread {
    public static void main(String[] args) {

        Thread thread = new Thread(new Calcula(5234, 49426, 0), "CALC-0");
        thread.start();

    }
}

class Calcula implements Runnable
{
    long valor1, valor2;
    int qtd;

    public Calcula(long valor1, long valor2, int qtd) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.qtd = qtd;
    }

    @Override
    public void run() {

        /*
        // EXEMPLO DE ESTADO WAITING
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        */

        BigInteger calculo = new BigInteger("0");

        for (int i = 0; i < valor1; i++) {
            for (int j = 0; j < valor2; j++) {
                calculo = calculo.add(new BigInteger("1"));
            }
        }

        String strCalculo = calculo.toString();
        strCalculo = strCalculo.substring(strCalculo.length()-3, strCalculo.length());

        System.out.println("Resultado-" + qtd + " = " + strCalculo);

        qtd++;
        Thread thread = new Thread(new Calcula(valor1+qtd, valor2+qtd, qtd), "CALC-" + qtd + " (" + strCalculo + ")");
        thread.start();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
