package br.com.panvel.modulo3.excecoes;

public abstract class Calculadora {

    static double dividir(double dividendo, double divisor)
    {
        if(divisor == 0)
            throw new DivisaoPorZero();
        return dividendo/divisor;
    }

    static double dividirPares(double dividendo, double divisor) throws DivisaoComImpar
    {
        if(divisor == 0)
            throw new DivisaoPorZero();
        if(dividendo % 2 != 0 || divisor % 2 != 0)
            throw new DivisaoComImpar();
        return dividendo/divisor;

    }


}
