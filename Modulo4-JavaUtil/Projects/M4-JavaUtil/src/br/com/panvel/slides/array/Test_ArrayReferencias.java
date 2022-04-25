package br.com.panvel.slides.array;

public class Test_ArrayPrimitivos {

    public static void main(String[] args) {

        // array de primitivos

        int arrayP[];
        arrayP = new int[10];
        System.out.println("arrayP->índice 0 = " + arrayP[0]);
        arrayP[0] = 20;
        System.out.println("arrayP->índice 0 = " + arrayP[0]);

        String printArrayP = "ArrayP = {";
        for (int i = 0; i < arrayP.length; i++) {
            arrayP[i] = i^2;
            printArrayP += arrayP[i];

            if(i != arrayP.length-1)
                printArrayP += ", ";
        }
        printArrayP += "}";
        System.out.println(printArrayP);


        // array de referências
        Cliente c = new Cliente("Erick");

        Cliente[] arrayR;
        arrayR = new Cliente[10];

        try {
            System.out.println(arrayR[2].getNome());
        }
        catch (Exception ex)
        {
            ex.getMessage();
        }
    }
}
