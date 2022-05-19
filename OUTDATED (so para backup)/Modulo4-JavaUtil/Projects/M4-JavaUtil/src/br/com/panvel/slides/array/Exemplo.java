package br.com.panvel.slides.array;

public class Exemplo {

    public static void main(String[] args) {

        double[] array1 = new double[10]; // Todas as poições tem valor 0
        double[] array2 = {10, 20, 30};

        array1[2] = 5000;

        for (int i = 0; i < array1.length; i++) {
            array1[i] += i * 5;
            System.out.println(array1[i]);
        }





        /*
        int numero = 3;
        double valor = numero; //cast implícito
        */

        /*
        int numero = 3;
        double valor = (double)numero; //cast explícito
        */
        ////////////////////////////////
        /*
        double numero = 3;
        int valor = numero; //cast implícito
        */


        double numero = 3;
        int valor = (int) numero; //cast explícito


        valor += 10;

        double s = numero * valor;


        Mae mae = new Mae();
        Filha filha = new Filha();
        mae = filha; //cast implícito
        mae = (Mae) filha; //cast explícito, mas desnecessário

        //filha = (Filha)mae;

        //Carro carro = new Carro();
        //mae = (Mae)carro;

    }

    static class Mae {
        public void test(){
            System.out.println("mae");
        }
    }

    static class Filha extends Mae {
        @Override
        public void test(){
            System.out.println("filha");
        }
    }

    static class Carro
    {}

}
