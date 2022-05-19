package br.com.panvel.modulo5.collections.sets.map;

import br.com.panvel.modulo5.collections.sets.Usuario;

import java.util.*;

public class test_map {
    public static void main(String[] args) {


        //region Map vs Set
        Sistema sistema = new Sistema();
        sistema.add(new Usuario("Erick", 251));
        sistema.add(new Usuario("Karoline", 657));
        sistema.add(new Usuario("Manoel", 987));
        sistema.add(new Usuario("Amanda", 987));


        System.out.println(
                sistema.getByID_Collection(657)
        );

        System.out.println(
                sistema.getByID_Map(251)
        );
        //endregion


        //region Iterando com Map
        Map<Integer, Usuario> map = sistema.getMap();


        //region keySet
        System.out.println("\nkeySet:");
        map.keySet().forEach(System.out::println);
        //endregion


        //region values
        System.out.println("\nvalues:");
        map.values().forEach(System.out::println);
        //endregion


        //region entrySet
        System.out.println("\nentrySet:");
        Set<Map.Entry<Integer, Usuario>> entries = map.entrySet();

        entries.forEach( entry ->
            System.out.println(entry.getKey() + " - " + entry.getValue())
            );
        //endregion

        Collection<Integer > t = new ArrayList<>();

        //region .forEach
        // forEach pede um BiConsumer, ao invés de Consumer
        System.out.println("\n.forEach com BiConsumer:");
        map.forEach( (id, usuario) ->
                System.out.println("Key=[" + id + "] | Value=[" + usuario + "]"));
        //endregion


        //region Iterator
        // Não existe Iterator, porque map não extende Iterable
        //Iterator<Usuario> it = map.iterator();
        //endregion

        //endregion

        }
    }
