import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class ForEach {
    public static void main(String[] args) {
        Cliente.list.stream()
                .limit(4)
        //        .forEach(System.out::println)
                .forEach(System.out::println);
    }
}

class Operacoes_Finais_Impedem_Novas_Operacoes_no_Stream {
    public static void main(String[] args) {
        Stream<Cliente> stream = Cliente.list.stream()
                .distinct();

        stream.forEach(System.out::println);
        //distinct.forEach(System.out::println);
        //stream.limit(1);
    }
}

class Count{
    public static void main(String[] args) {
        long count = Cliente.list.stream()
                .filter(c -> c.idade >= 18)
                .count();

        System.out.println("Cliente.list.size(): " + Cliente.list.size());
        System.out.println("count: " + count);
    }
}

class Min_Max{
    public static void main(String[] args) {
        Optional<Cliente> min = Cliente.list.stream()
                .min(Comparator.naturalOrder());

        Optional<Cliente> max = Cliente.list.stream()
                .max(Comparator.naturalOrder());

        System.out.println("Min: " + min.get());
        System.out.println("Max: " + max.get());
    }
}

class Collect_toList {
    public static void main(String[] args) {
        List<Cliente> collect = Cliente.list.stream()
                .distinct()
                .filter(c -> c.idade <= 21)
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}

class Collect_GroupingBy {
    public static void main(String[] args) {
        Map<Integer, List<Cliente>> collect = Cliente.list.stream()
                .distinct()
                .collect(Collectors.groupingBy(e -> e.idade));

        System.out.println("Agrupamento por idade: " + collect);

        Map<Boolean, List<Cliente>> collect1 = Cliente.list.stream()
                .distinct()
                .collect(Collectors.groupingBy(e -> e.idade >= 18));

        System.out.println("Agrupamento por +18: " + collect1);
    }
}

class Collect_Joining {
    public static void main(String[] args) {
        String joining1 = Cliente.list.stream()
                .map(Cliente::toString)
                .collect(Collectors.joining());

        System.out.println(joining1);

        String joining2 = Cliente.list.stream()
                .map(e -> e.nome)
                .collect(Collectors.joining(";"));

        System.out.println(joining2);
    }
}