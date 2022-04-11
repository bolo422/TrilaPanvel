public class Cliente {
    Cliente(String nome, String cpf)
    {
        this.nome = nome;
        this.cpf = cpf;
    }

    Cliente(Cliente cliente)
    {
        this(cliente.getNome(), cliente.getCpf());
    }

    private String nome, cpf;

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}





