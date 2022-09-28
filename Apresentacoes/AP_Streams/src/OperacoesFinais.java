import java.util.Comparator;
import java.util.Optional;
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