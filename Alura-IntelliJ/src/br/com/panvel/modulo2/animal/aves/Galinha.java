package br.com.panvel.modulo2.animal.aves;

public class Galinha extends Ave {

    public Galinha(String especie, Alimentacao alimentacao)
    {
        super(especie,alimentacao);
    }

    @Override
    public void Falar()
    {
        System.out.println("A galinha carcareja ou pia: cocorocó");
    }
}
