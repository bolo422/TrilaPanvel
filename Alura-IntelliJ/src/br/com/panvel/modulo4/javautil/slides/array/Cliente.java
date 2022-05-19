package br.com.panvel.modulo4.javautil.slides.array;

public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome)
    {
        this.nome = nome;
    }
    public Cliente(String nome, String cpf) {this(nome); this.cpf = cpf;}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    @Override
    public boolean equals(Object obj)
    {
        Cliente ref = (Cliente)obj;
        return (this.cpf == ref.cpf && this.nome == ref.nome);
    }
}


