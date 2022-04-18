package br.com.panvel.tests;

import br.com.panvel.animal.Animal;
import br.com.panvel.animal.aves.*;
import br.com.panvel.animal.mamifero.*;
import br.com.panvel.interfaces.Voador;

import java.util.Locale;

public class Test_Interfaces {

    public static void main(String[] args) {
        System.out.println("\nAgora a referência é um morcego: ");
        Voador referenciDeVoador = new Morcego("morcego", Animal.Alimentacao.herbivoro);
        referenciDeVoador.Voar();

        System.out.println("\nAgora a referência é uma águia: ");
        referenciDeVoador = new Aguia("ave", Animal.Alimentacao.carnivoro);
        referenciDeVoador.Voar();

        System.out.println("\nAgora a referência é um pombo: ");
        referenciDeVoador = new Pombo("pombo", Animal.Alimentacao.onivoro);
        referenciDeVoador.Voar();


        String test = "aaa";
        test = test.toLowerCase();
    }
}
