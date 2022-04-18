package br.com.panvel.tests;

import br.com.panvel.animal.Animal;
import br.com.panvel.animal.Animal.Alimentacao;
import br.com.panvel.animal.aves.*;
import br.com.panvel.animal.mamifero.*;
import br.com.panvel.interfaces.Voador;

import java.util.Locale;

public class Test_Interfaces {

    public static void main(String[] args) {
        System.out.println("\nAgora a referência é um morcego: ");
        Voador referenciaDeVoador = new Morcego("morcego", Alimentacao.herbivoro);
        referenciaDeVoador.Voar();

        System.out.println("\nAgora a referência é uma águia: ");
        referenciaDeVoador = new Aguia("ave", Alimentacao.carnivoro);
        referenciaDeVoador.Voar();

        System.out.println("\nAgora a referência é um pombo: ");
        referenciaDeVoador = new Pombo("pombo", Alimentacao.onivoro);
        referenciaDeVoador.Voar();

    }
}
