package br.com.panvel.tests;

import br.com.panvel.animal.Animal;
import br.com.panvel.animal.aves.*;
import br.com.panvel.animal.mamifero.*;

public class Test_Referencias {

    public static void main(String[] args) {
        System.out.println("\nAgora a referência é um morcego: ");
        Animal referenciaDeAnimal = new Morcego("morcego", Animal.Alimentacao.herbivoro);
        referenciaDeAnimal.Falar();

        System.out.println("\nAgora a referência é uma águia: ");
        referenciaDeAnimal = new Aguia("ave", Animal.Alimentacao.carnivoro);
        referenciaDeAnimal.Falar();

        System.out.println("\nAgora a referência é uma galinha: ");
        referenciaDeAnimal = new Galinha("galinha", Animal.Alimentacao.onivoro);
        referenciaDeAnimal.Falar();

        System.out.println("\nAgora a referência é um pombo: ");
        referenciaDeAnimal = new Pombo("pombo", Animal.Alimentacao.onivoro);
        referenciaDeAnimal.Falar();


    }
}
