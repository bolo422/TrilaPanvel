import java.util.Arrays;
import java.util.List;

class OperacoesIntermediarias {
}

class Skip {
    public static void main(String[] args) {
        System.out.println(Cliente.list);

        Cliente.list.stream()
                .skip(2)
                .forEach(System.out::println);
    }
}

class Limit {
    public static void main(String[] args) {
        System.out.println(Cliente.list);

        Cliente.list.stream()
                .limit(3)
                .forEach(System.out::println);
    }
}

class Distinct { // Utiliza Equals e HashCode para comparar
    public static void main(String[] args) {
        System.out.println(Cliente.list);

        Cliente.list.stream()
                .distinct()
                .forEach(System.out::println);
    }
}

class Filter {
    public static void main(String[] args) {
        System.out.println(Cliente.list);

        Cliente.list.stream()
                .filter(c -> c.idade < 20)
                .forEach(System.out::println);
    }
}

class MisturandoFiltros {
    public static void main(String[] args) {
        System.out.println(Cliente.list);

        Cliente.list.stream()
                .skip(4)
                .distinct()
                .limit(3)
                .filter(c -> c.idade <= 21)
                .forEach(System.out::println);
    }
}

// não tem a ver com interface Map, Hashmap nem nada disso!
// Este map significa transformação
class Map_Intro {
    public static void main(String[] args) {
        Cliente.list.stream()
                .map(c -> c = new Cliente("Andrei", 30))
                .distinct()
                .forEach(System.out::println);

        System.out.println(Cliente.list);
    }
}

class Map_ListaNaoPodeSerModificada {
    public static void main(String[] args) {
        Cliente.list.stream()
                .map(c -> c.nome = c.nome.toUpperCase())
                .forEach(System.out::println);

        System.out.println(Cliente.list);
    }
}
