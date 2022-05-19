package br.com.panvel.collections.listas;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ExercicioAlura {

    public static void main(String[] args) {

        //region Iterando em um mapa (Key)
        Map<Integer, String> pessoas = new HashMap<>();

        pessoas.put(21, "Leonardo Cordeiro");
        pessoas.put(27, "Fabio Pimentel");
        pessoas.put(19, "Silvio Mattos");
        pessoas.put(23, "Romulo Henrique");

        pessoas.keySet().forEach(idade ->
            System.out.println(pessoas.get(idade) + ", " + idade + " anos")
        );
        //endregion



        Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);

        System.out.println("\nkeySet:");
        nomesParaIdade.keySet().forEach(
                key -> System.out.println(key)
        );

        System.out.println("\nvalues:");
        nomesParaIdade.values().forEach(System.out::println);

        System.out.println("\nentrySet:");
        Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();
        for (Entry<String, Integer> associacao : associacoes) {
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        }


    }
}
