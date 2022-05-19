package br.com.panvel.modulo5.collections.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class test_for {
    public static void main(String[] args) {

        Set<Carteira> set = new HashSet<>();
        set.add(new Carteira(5.0));
        set.add(new Carteira(7.0));
        set.add(new Carteira(3.0));



        System.out.println("\nMethod For Each with Lambda:");
        set.forEach((c)-> System.out.println(c)); // Lambda (Java 8)


        System.out.println("\nMethod Reference:");
        set.forEach(System.out::println); // Method Reference (Java 8)


        System.out.println("\nFor Each:");
        for(Carteira c : set) // For Each (Java 5)
        {
            System.out.println(c);
        }


        System.out.println("\nIterator:");
        Iterator<Carteira> it = set.iterator(); // Iterator (Java 1.2)

        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        it.next(); // No Such Element Exeption

    }
}
