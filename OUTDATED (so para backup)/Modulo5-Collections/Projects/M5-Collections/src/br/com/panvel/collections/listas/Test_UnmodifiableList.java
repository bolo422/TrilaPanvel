package br.com.panvel.collections.listas;

import java.util.*;

public class Test_UnmodifiableList {
    public static void main(String[] args) {
        Convidados convidados = new Convidados();
        convidados.add("Erick");
        convidados.add("Rafael");

        List<String> list = convidados.getList();

        convidados.add("Maria");

        System.out.println("Convidados: " + convidados);
        System.out.println("list: " + list);


    }
}


class Convidados
{
    private List<String> convidados;

    Convidados()
    {
        convidados = new ArrayList<>();
    }

    public List<String> getList() {
        return Collections.unmodifiableList(convidados);
    }

    public String get(int index)
    {
        if(index <= convidados.size())
            return convidados.get(index);
        return null;
    }

    public void add(String convidado)
    {
        if(convidado != null)
            convidados.add(convidado);
    }

    public void remove(int index)
    {
        if(index <= convidados.size())
            convidados.remove(index);
    }

    public int size()
    {
        return convidados.size();
    }

    @Override
    public String toString() {
        return convidados.toString();
    }
}