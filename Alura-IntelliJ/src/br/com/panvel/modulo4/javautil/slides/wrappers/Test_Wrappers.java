package br.com.panvel.modulo4.javautil.slides.wrappers;

import java.util.ArrayList;

public class Test_Wrappers {
    public static void main(String[] args) {

        Integer ref = Integer.valueOf(50);

        int valor = ref.intValue();

        String s = "5";
        Integer num = Integer.valueOf(s);
        int a = Integer.parseInt(s);


        ArrayList<Number> list = new ArrayList<>();

        list.add(5);
        list.add(50.35749);


    }
}
