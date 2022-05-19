package br.com.panvel.modulo4.javautil.slides.util;

import br.com.panvel.modulo4.javautil.slides.array.Cliente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test_Equals {
    public static void main(String[] args) {

        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        Cliente c1 = new Cliente("Erick", "100.100.100-10");
        Cliente c2 = new Cliente("Erick", "100.100.100-10");
        clientes.add(c1);
        boolean bool = clientes.contains(c2);
        System.out.println(bool);

        /*ArrayList<Integer> integers = new ArrayList<Integer>();
        int number = 5;
        integers.add(number);
        int newNumber = 5;
        boolean bool2 = integers.contains(newNumber);
        System.out.println(bool2);*/

        Cliente[] arrClientes = new Cliente[20];
        List<Cliente> listClientes = Arrays.asList(arrClientes);
        listClientes.get(2);








    }
}
