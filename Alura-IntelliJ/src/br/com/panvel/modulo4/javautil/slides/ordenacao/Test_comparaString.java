package br.com.panvel.modulo4.javautil.slides.ordenacao;

import br.com.panvel.modulo4.javautil.slides.array.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test_comparaString {
    public static void main(String[] args) {

        List<Cliente> list = new ArrayList<Cliente>();
        list.add(new Cliente("Erick"));
        list.add(new Cliente("Alberto"));
        list.add(new Cliente("Rodolfo"));

        System.out.println("Antes de ordenar:");
        for (Cliente c: list) {
            System.out.println(c.getNome());
        }

        ComparaCliente comparator = new ComparaCliente();
        list.sort(comparator);

        System.out.println("\nDepois de ordenar:");
        for (Cliente c: list) {
            System.out.println(c.getNome());
        }
    }
}

class ComparaCliente implements Comparator<Cliente> {
    @Override
    public int compare(Cliente c1, Cliente c2) {
        return c1.getNome().compareTo(c2.getNome());
    }
}



