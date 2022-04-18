package br.com.panvel.animal.aves;

public class Aguia extends AvesVoadoras {

    public Aguia(String especie, Alimentacao alimentacao)
    {
        super(especie,alimentacao);
    }

    @Override
    public void Falar()
    {
        System.out.println("A águia grasna ou pia: croac croac");
    }

    @Override
    public void Voar()
    {
        System.out.println("Dependendo a espécie, a águia pode voar até 320 km/h!");
    }
}