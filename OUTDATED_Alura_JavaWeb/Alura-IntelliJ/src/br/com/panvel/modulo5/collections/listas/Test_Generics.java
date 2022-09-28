package br.com.panvel.modulo5.collections.listas;

import java.util.ArrayList;
import java.util.List;

public class Test_Generics {

    public static void main(String[] args) {

        //Collection<Integer, Double> list = new ArrayList<>();

        List<Object> objList = new ArrayList<>();
        objList.add(new ClasseUm());
        objList.add(new ClasseDois());

        List<Listavel> listavelList = new ArrayList<>();
        listavelList.add(new ClasseUm());
        listavelList.add(new ClasseDois());


        Box<Double, String> box = new Box<>();
        //box.add(1.2, 5); //tipo inválido
        box.add(2.3, "abc");

        List<Box<Integer, String>> boxList = new ArrayList<>();










        // apenas para remover marcação do intelij
        for (Object o: objList) {}
        for (Listavel l: listavelList) {}
    }
}

interface Listavel{}

class ClasseUm implements Listavel{}
class ClasseDois implements Listavel{}

class Box<First, Second> {
    private First first;
    private Second second;

    public void add(First first, Second second) {
        this.first = first;
        this.second = second;
    }

    public First getFirst() {
        return first;
    }

    public Second getSecond() {
        return second;
    }
}


