package br.com.panvel.collections.sets;

import java.util.*;

public class test_sets {
    public static void main(String[] args) {

        Set<Usuario> usuarios = new LinkedHashSet<>();

        usuarios.add(new Usuario("Marcos", 37));
        usuarios.add(new Usuario("Erick", 22));
        usuarios.add(new Usuario("Amanda", 18));
        usuarios.add(new Usuario("Brenda", 55));

        System.out.println(usuarios);


    }
}
