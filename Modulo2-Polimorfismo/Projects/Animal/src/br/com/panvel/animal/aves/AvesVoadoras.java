package br.com.panvel.animal.aves;

import br.com.panvel.interfaces.Voador;

public abstract class AvesVoadoras extends Ave implements Voador {
    AvesVoadoras(String especie, Alimentacao alimentacao)
    {
        super(especie,alimentacao);
    }
}
