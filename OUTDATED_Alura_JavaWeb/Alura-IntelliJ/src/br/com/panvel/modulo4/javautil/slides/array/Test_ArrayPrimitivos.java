package br.com.panvel.modulo4.javautil.slides.array;

public class Test_ArrayPrimitivos {

    public static void main(String[] args) {

        // array de primitivos

        int[] array;
        array = new int[3];
        System.out.println("arrayP->índice 0 = " + array[0]);
        array[0] = 20;
        array[2] = 5;
        System.out.println("arrayP->índice 0 = " + array[0]);

        StringBuilder printArrayP = new StringBuilder("ArrayP = {");
        for (int i = 0; i < array.length; i++) {
            array[i] = i^2;
            printArrayP.append(array[i]);

            if(i != array.length-1)
                printArrayP.append(", ");
        }
        printArrayP.append("}");
        System.out.println(printArrayP);

    }
}



