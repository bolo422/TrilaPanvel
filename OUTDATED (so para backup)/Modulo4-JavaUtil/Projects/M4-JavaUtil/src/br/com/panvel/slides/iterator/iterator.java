package br.com.panvel.slides.iterator;

import java.util.*;

public class iterator {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Super Mario");
        nomes.add("Yoshi");
        nomes.add("Donkey Kong");

        Iterator<String> it = nomes.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

        Set<String> nomes2 = new HashSet<>();
        nomes.add("Super Mario");
        nomes.add("Yoshi");
        nomes.add("Donkey Kong");

        Iterator<String> it2 = nomes.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}


