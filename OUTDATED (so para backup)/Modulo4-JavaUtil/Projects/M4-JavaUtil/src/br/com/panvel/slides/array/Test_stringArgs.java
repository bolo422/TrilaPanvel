package br.com.panvel.slides.array;

public class Test_stringArgs {
    public static void main(String[] args) {

        int n1 = 20, n2 = 10;

        for (String s: args) {
            switch(s)
            {
                case "a":
                    System.out.print("\nAdicao, resultado = " + (n1+n2));
                    break;

                case "s":
                    System.out.print("\nSubtracao, resultado = " + (n1-n2));
                    break;

                case "d":
                    System.out.print("\nDivisao, resultado = " + (n1/n2));
                    break;

                case "m":
                    System.out.print("\nMultiplicacao, resultado = " + (n1*n2));
                    break;

                default:
                    System.out.print("\nParametro nao reconhecido");
                    break;
            }
        }

        System.out.print("\nFim do main");


    }
}
