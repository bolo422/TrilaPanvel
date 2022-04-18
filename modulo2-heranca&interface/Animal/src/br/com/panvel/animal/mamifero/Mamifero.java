package br.com.panvel.animal.mamifero;

import br.com.panvel.animal.Animal;

public abstract class Mamifero extends Animal {

    protected Mamifero(String especie, Alimentacao alimentacao)
    {
        super(especie,alimentacao);
    }

}
