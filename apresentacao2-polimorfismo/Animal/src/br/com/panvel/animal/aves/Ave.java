package br.com.panvel.animal.aves;

import br.com.panvel.animal.Animal;

public abstract class Ave extends Animal{

    protected Ave(String especie, Alimentacao alimentacao)
    {
        super(especie,alimentacao);
    }

}
