package br.com.panvel.animal.aves;

public class Pombo extends AvesVoadoras {

    public Pombo(String especie, Alimentacao alimentacao)
    {
        super(especie,alimentacao);
    }

    @Override
    public void Falar()
    {
        System.out.println("O pombo arrulha ou arrola: crruu crruu");
    }

    @Override
    public void Voar()
    {
        System.out.println("Quando um pombo voa, é melhor não ficar embaixo!");
    }
}