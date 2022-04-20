package br.com.panvel.tests;

import br.com.panvel.animal.Animal;
import br.com.panvel.animal.Animal.Alimentacao;
import br.com.panvel.animal.aves.*;
import br.com.panvel.animal.mamifero.*;

public class Test_Referencias {

    public static void main(String[] args) {
        System.out.println("\nAgora a referência é um morcego: ");
        Animal referenciaDeAnimal = new Morcego("morcego", Alimentacao.herbivoro);
        referenciaDeAnimal.Falar();

        System.out.println("\nAgora a referência é uma águia: ");
        referenciaDeAnimal = new Aguia("ave", Alimentacao.carnivoro);
        referenciaDeAnimal.Falar();

        System.out.println("\nAgora a referência é uma galinha: ");
        referenciaDeAnimal = new Galinha("galinha", Alimentacao.onivoro);
        referenciaDeAnimal.Falar();

        System.out.println("\nAgora a referência é um pombo: ");
        referenciaDeAnimal = new Pombo("pombo", Alimentacao.onivoro);
        referenciaDeAnimal.Falar();




        // Objetos não mudam de tipo, por isso usamos referências genéricas, como Super Classes ou Interfaces

        Pombo pom = new Pombo("pombo", Alimentacao.onivoro);

        //pom = new Aguia("Aguia", Alimentacao.carnivoro);
        //Pombo aguia = new Aguia("pombo", Alimentacao.onivoro);


    }
}
