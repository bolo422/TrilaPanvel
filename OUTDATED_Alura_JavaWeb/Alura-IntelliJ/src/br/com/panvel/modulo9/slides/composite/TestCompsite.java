package br.com.panvel.modulo9.slides.composite;

import br.com.panvel.modulo9.slides.composite.tree.Component;
import br.com.panvel.modulo9.slides.composite.tree.Composite;
import br.com.panvel.modulo9.slides.composite.tree.Leaf;

public class TestCompsite {
    public static void main(String[] args) {


        //region PC
        Composite pc = new Composite("PC");

            //region Gabinete
        Composite cabinet = new Composite("Gabinete");
            pc.addComponent(cabinet);
                Leaf hd = new Leaf("HDD", 250.00);
                cabinet.addComponent(hd);

                //region Placa mãe
        Composite motherboard = new Composite("Placa Mãe");
                cabinet.addComponent(motherboard);
                    Leaf ram = new Leaf("RAM", 375.00);
                    motherboard.addComponent(ram);
                    Leaf cpu = new Leaf("CPU", 890.00);
                    motherboard.addComponent(cpu);
        //endregion
        //endregion

            //region Periféricos
        Composite peripherals = new Composite("Periféricos");
            pc.addComponent(peripherals);
                Leaf mouse = new Leaf("Mouse", 115.00);
                peripherals.addComponent(mouse);
                Leaf keyboard = new Leaf("Teclado", 200.00);
                peripherals.addComponent(keyboard);
        //endregion
        //endregion


        System.out.println("\n-------------\nGabinete:\n");
        cabinet.showPrice("");

        System.out.println("\n-------------\nPC:\n");
        pc.showPrice("");

        System.out.println("\n-------------\nPreços:\n");
        System.out.println("RAM: " + ram.getPrice());
        System.out.println("Gabinete: " + cabinet.getPrice());
        System.out.println("Placa Mãe: " + motherboard.getPrice());
        System.out.println("PC: " + pc.getPrice());



        /*   Também é possível criar a árvore sem criar instâncias para leafs */
        Composite comp = new Composite("Composite");
            comp.addComponent(new Composite("Child Composite"));
            comp.addComponent(new Leaf("Leaf", 200));

    }
}
