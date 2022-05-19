package br.com.panvel.modulo2.animal.aves;

import br.com.panvel.modulo2.interfaces.Voador;

public abstract class AvesVoadoras extends Ave implements Voador {
    AvesVoadoras(String especie, Alimentacao alimentacao)
    {
        super(especie,alimentacao);
    }
}
