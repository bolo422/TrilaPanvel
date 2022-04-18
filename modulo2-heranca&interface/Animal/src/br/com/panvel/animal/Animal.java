package br.com.panvel.animal;

public abstract class Animal {

    public enum Alimentacao{
        herbivoro,
        carnivoro,
        onivoro
    }

    String especie;
    Alimentacao alimentacao;

    protected Animal(String especie, Alimentacao alimentacao)
    {
        this.especie = especie;
        this.alimentacao = alimentacao;
    }

    abstract public void Falar();

}
