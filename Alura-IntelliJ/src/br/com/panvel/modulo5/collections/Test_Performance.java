package br.com.panvel.modulo5.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Test_Performance {


    /*
    TESTE DE PERFORMANCE
    ArrayList VS HashSet
     */


    public static void main(String[] args) {

        //region ArrayList
        Collection<Integer> arrayList = new ArrayList<>();
        long adiciona = adiciona(arrayList);
        long pesquisa = pesquisa(arrayList);


        System.out.println("Tempo para ADICAO de elementos na ArrayList: " + adiciona);
        System.out.println("Tempo para PESQUISA na colecao na ArrayList: " + pesquisa);
        System.out.println("Tempo total gasto (ArrayList): " + (adiciona + pesquisa));
        //endregion

        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");

        //region HashSet
        Collection<Integer> hashSet = new HashSet<>();
        adiciona = adiciona(hashSet);
        pesquisa = pesquisa(hashSet);

        System.out.println("Tempo para ADICAO de elementos no HashSet: " + adiciona);
        System.out.println("Tempo para PESQUISA na colecao no HashSet: " + pesquisa);
        System.out.println("Tempo total gasto (HashSet): " + (adiciona + pesquisa));
        //endregion

        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");

        //region RandomAcess

        //region RA -> ArrayList
        long randomAccess = 0;
        for (int i = 0; i < 20000; i++) {
            randomAccess += randomAcessList((List) arrayList);
        }
        System.out.println("Tempo para Random Access na ArrayList: " + randomAccess);
        //endregion


        //region RA -> HashSet
        randomAccess = 0;
        for (int i = 0; i < 20000; i++) {
            randomAccess += randomAcessCollection(arrayList);
        }
        System.out.println("Tempo para Random Access no HashSet: " + randomAccess);
        //endregion

        //endregion

    }

    //region Methods
    static long adiciona(Collection<Integer> collection) {
        long inicio = System.currentTimeMillis();
        for (int i = 1; i <= 50000; i++) {
            collection.add(i);
        }
        long fim = System.currentTimeMillis();

        return fim - inicio;
    }

    static long pesquisa(Collection<Integer> collection) {
        long inicio = System.currentTimeMillis();
        for (Integer numero : collection) {
            collection.contains(numero);
        }
        long fim = System.currentTimeMillis();

        return fim - inicio;
    }

    static long randomAccess(Collection<Integer> collection) {
        long inicio = System.currentTimeMillis();

        ArrayList<Integer> list;
        try {
            list = (ArrayList<Integer>) collection;
        } catch (ClassCastException ex) {
            list = new ArrayList<>(collection);
        }

        int i = list.get(list.size() / 2);
        long fim = System.currentTimeMillis();

        return fim - inicio;
    }

    static long randomAcessList(List<Integer> list) {
        long inicio = System.currentTimeMillis();
        int i = list.get(list.size() / 2);
        long fim = System.currentTimeMillis();
        return fim - inicio;
    }

    static long randomAcessCollection(Collection<Integer> collection) {
        long inicio = System.currentTimeMillis();
        List<Integer> list = new ArrayList<>(collection);
        int i = list.get(list.size() / 2);
        long fim = System.currentTimeMillis();
        return fim - inicio;
    }
    //endregion


}
