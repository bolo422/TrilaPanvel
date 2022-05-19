package br.com.panvel.slides.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayToList {
    public static void main(String[] args) {
        String[] strArray = new String[] {"A", "B", "C"};
        List<String> strList1 = Arrays.asList(strArray);
        List<String> strList2 = new ArrayList<>(Arrays.asList(strArray));


        strList1.set(0, "X");
        strList2.set(1, "Y");

        for (int i = 0; i < strArray.length; i++) {
            String str = "Array[" + i + "] = " + strArray[i];
            System.out.println(str);
        }
        System.out.println("//////////");
        for (int i = 0; i < strArray.length; i++) {
            String str = "strList1[" + i + "] = " + strList1.get(i);
            System.out.println(str);
        }
        System.out.println("//////////");
        for (int i = 0; i < strArray.length; i++) {
            String str = "strList2[" + i + "] = " + strList2.get(i);
            System.out.println(str);
        }


        System.out.println("//////////");
        try {
            System.out.println("/__ strList1.add(\"G\") __/");
            strList1.add("G");
            System.out.println("Sucess!");
        }
        catch (Exception ex){System.out.println(ex);}

        try {
            System.out.println("/__ strList2.add(\"J\") __/");
            strList2.add("J");
            System.out.println("Sucess!");
        }
        catch (Exception ex){System.out.println(ex);}

    }
}
