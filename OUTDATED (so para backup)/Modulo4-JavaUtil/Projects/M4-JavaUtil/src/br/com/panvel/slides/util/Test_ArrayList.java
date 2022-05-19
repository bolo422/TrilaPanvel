package br.com.panvel.slides.util;

import br.com.panvel.slides.array.Carro;
import br.com.panvel.slides.array.Cliente;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test_ArrayList {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();

        Cliente c1 = new Cliente("Erick");
        arrayList.add(c1);

        Cliente c2 = new Cliente("Rafael");
        arrayList.add(c2);

        Object object = arrayList.get(0);
        arrayList.remove(0);
        boolean bool = arrayList.isEmpty();
        int size = arrayList.size();

        System.out.println(arrayList.size());

        //Cliente ref = arrayList.get(0);
        Cliente ref = (Cliente)arrayList.get(0);
        System.out.println(ref.getNome());




        //region Preenchendo a lista
        arrayList.add(new Cliente("c1"));
        arrayList.add(new Cliente("c2"));
        arrayList.add(new Cliente("c3"));
        arrayList.add(new Cliente("c4"));
        //endregion

        for (int i = 0; i < arrayList.size(); i++) {

            Cliente cRef = (Cliente)arrayList.get(i);
            System.out.println(cRef.getNome());
        }

        for(Object obj : arrayList)
        {
            Cliente cRef = (Cliente)obj;
            System.out.println(cRef.getNome());
        }



        ArrayList clientes = new ArrayList();


        Carro carro = new Carro(5);
        clientes.add(carro);
        Cliente cl = (Cliente)clientes.get(0);




        ArrayList<Cliente> arrayList1 = new ArrayList<Cliente>();
        //arrayList1.add(carro);
        arrayList1.add(new Cliente("Erick"));
        System.out.println(arrayList1.get(0).getNome());

        // wrappers
        //ArrayList<int> intArray = new ArrayList<int>();
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();


    }
}
