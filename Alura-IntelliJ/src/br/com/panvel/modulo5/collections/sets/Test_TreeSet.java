package br.com.panvel.modulo5.collections.sets;

import java.util.TreeSet;

public class Test_TreeSet {
    public static void main(String[] args) {

        //region TreeSet com Comparable
        Cliente c1 = new Cliente("Fabricio");
        Cliente c2 = new Cliente("Brenda");
        Cliente c3 = new Cliente("Alfredo");
        Cliente c4 = new Cliente("Daniel");

        TreeSet<Cliente> treeSet = new TreeSet<>();
        treeSet.add(c1);
        treeSet.add(c2);
        treeSet.add(c3);
        treeSet.add(c4);

        System.out.println(treeSet);
        //endregion


        //region TreeSet com Comparator
        TreeSet<Carteira> treeSet2 = new TreeSet<>(
                (carteira1, carteira2) ->
                        Double.compare(carteira1.getSaldo(), carteira2.getSaldo())
        );

        treeSet2.add(new Carteira(10));
        treeSet2.add(new Carteira(5));
        treeSet2.add(new Carteira(7));

        System.out.println(treeSet2);
        //endregion

    }
}

class Cliente implements Comparable<Cliente>
{
    String nome;
    Cliente(String nome)
    {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public int compareTo(Cliente outro) {
        return this.nome.compareTo(outro.getNome());
    }
}


class Carteira
{
    double saldo;
    Carteira(double saldo)
    {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public String toString() {
        return Double.toString(this.saldo);
    }




    public void duplicaSaldo()
    { saldo *= 2;}
}
