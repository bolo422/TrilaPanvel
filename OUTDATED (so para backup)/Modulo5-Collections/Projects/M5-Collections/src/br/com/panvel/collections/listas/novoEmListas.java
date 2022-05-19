package br.com.panvel.collections.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class novoEmListas {
    public static void main(String[] args) {

        Festa festa = new Festa();
        festa.addConvidado("Erick", 23);
        festa.addConvidado("Rafael", 30);
        festa.addConvidado("Afonso", 25);

        int idadeTotalAtributo = festa.getIdadeTotalAtributo();
        System.out.println("Atributo: " + idadeTotalAtributo);

        int idadeTotal = festa.getIdadeTotal();
        System.out.println("IdadeTotal: " + idadeTotal);


    }
}


class Festa
{
    private String local;
    private List<Convidado> convidados = new ArrayList<>();
    private int idadeTotal = 0;

    //region constructors
    public List<Convidado> getConvidados() {
        return Collections.unmodifiableList(convidados);
    }
    //endregion

    public void addConvidado(Convidado convidado)
    {
        convidados.add(convidado);
        idadeTotal += convidado.getIdade();
    }

    public void addConvidado(String nome, int idade)
    {
        addConvidado(new Convidado(nome, idade));
    }

    public int getIdadeTotalAtributo() {
        return idadeTotal;
    }

    public int getIdadeTotal() {
        return this.convidados.stream().mapToInt(Convidado::getIdade).sum();
    }

    @Override
    public String toString() {
        return convidados.toString();
    }
}

class Convidado
{
    private String nome;
    private int idade;

    Convidado(String nome, int idade)
    {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}

