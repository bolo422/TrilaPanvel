package br.com.panvel.slides.array;

public class Test_Array {

    public static void main(String[] args) {


        // array de primitivos


        int array[];
        array = new int[10];
        System.out.println("arrayP->indice 0 = " + array[0]);
        array[0] = 20;
        System.out.println("arrayP->indice 0 = " + array[0]);

        String printArrayP = "ArrayP = {";
        for (int i = 0; i < array.length; i++) {
            array[i] = i ^ 2;
            printArrayP += array[i];

            if (i != array.length - 1)
                printArrayP += ", ";
        }
        printArrayP += "}";
        System.out.println(printArrayP);

    }
}
