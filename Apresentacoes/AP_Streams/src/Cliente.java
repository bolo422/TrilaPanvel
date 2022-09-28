import java.util.List;
import java.util.Objects;

public class Cliente implements Comparable<Cliente>{

    String nome;
    Integer idade;
    Cliente(String nome, Integer idade)
    {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return nome + " - " + idade + " anos";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nome, cliente.nome) && Objects.equals(idade, cliente.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }

    @Override
    public int compareTo(Cliente o) {
        return idade.compareTo(o.idade);
    }

    static List<Cliente> list;
    static {
        list = List.of(
                new Cliente("Maria", 25),
                new Cliente("Rafael", 22),
                new Cliente("Rafael", 22),
                new Cliente("Erick", 20),
                new Cliente("Marcia", 20),
                new Cliente("Antonio", 19),
                new Cliente("Antonio", 19),
                new Cliente("Priscila", 18),
                new Cliente("Pedro", 17)
        );
    }


}
