package br.com.panvel.modulo2.animal;

public abstract class Animal {

    public enum Alimentacao{
        herbivoro,
        carnivoro,
        onivoro
    }

    protected String especie;
    protected Alimentacao alimentacao; // PROTECTED

    protected Animal(String especie, Alimentacao alimentacao)
    {
        this.especie = especie;
        this.alimentacao = alimentacao;
    }

    abstract public void Falar();

}
