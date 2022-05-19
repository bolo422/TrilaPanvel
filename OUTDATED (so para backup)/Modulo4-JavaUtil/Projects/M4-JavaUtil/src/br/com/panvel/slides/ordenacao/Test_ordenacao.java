package br.com.panvel.slides.ordenacao;

import br.com.panvel.slides.array.Carro;
import br.com.panvel.slides.array.Cliente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Test_ordenacao {
    public static void main(String[] args) {

        List<Carro> list = new ArrayList<Carro>();
        list.add(new Carro(50));
        list.add(new Carro(10));
        list.add(new Carro(30));

        Consumer<Carro> consumer = (cliente) -> System.out.println(cliente.getVelocidade());

        System.out.println("Antes de ordenar:");
        list.forEach(consumer);

        list.sort( (c1, c2) -> Double.compare(c1.getVelocidade(), c2.getVelocidade()) );

        System.out.println("\nDepois de ordenar:");
        list.forEach(consumer);
    }
}


