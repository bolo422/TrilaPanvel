package br.com.panvel.modulo3.excecoes;

public class Main_Calculadora {

    public static void main(String[] args) {

        // Sem exceção
        System.out.println("10/2 = " + Calculadora.dividir(10, 2));

        // Checked
        try
        {
            System.out.println("16/14 = " + Calculadora.dividirPares(16,14));
            System.out.println("7/2 = " + Calculadora.dividirPares(7,2));
        }
        catch (DivisaoComImpar ex)
        {
            System.out.println("EXCPETION: " + ex);
        }


        // Unchecked
        System.out.println("5/0 = " + Calculadora.dividir(5, 0));

        // Demonstração de Checked sem try catch
        // Calculadora.dividirPares(2,2);

        System.out.println("fim");
    }

}
