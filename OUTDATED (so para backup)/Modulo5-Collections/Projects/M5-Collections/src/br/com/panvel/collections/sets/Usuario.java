package br.com.panvel.collections.sets;

import java.util.Objects;

public class Usuario implements Comparable<Usuario>{
    private String nome;
    private int id;

    //region Implementacao ocultada
    public Usuario(String nome, int id)
    {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "{" + nome + "-id: " + id + "}";
    }

    @Override
    public int compareTo(Usuario o) {
        return this.nome.compareTo(o.getNome());
    }
    //endregion


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return id == usuario.id && Objects.equals(nome, usuario.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, id);
    }
}



