public class ForEach_Stream {
    public static void main(String[] args) {
        System.out.println("for (each):\n");
        for(Cliente c : Cliente.list){
            System.out.println(c.nome + " tem " + c.idade + " anos."); // for
        }

        System.out.println("forEach:\n");
        Cliente.list
                .forEach(c -> System.out.println(c.nome + " tem " + c.idade + " anos.")); // Iterable

        System.out.println("\n------------\nStream:\n");
        Cliente.list.stream()
                .forEach(c -> System.out.println(c.nome + " tem " + c.idade + " anos.")); // Stream

    }
}
