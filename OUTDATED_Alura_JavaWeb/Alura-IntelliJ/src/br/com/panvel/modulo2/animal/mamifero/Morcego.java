package br.com.panvel.modulo2.animal.mamifero;

import br.com.panvel.modulo2.interfaces.Voador;

public class Morcego extends Mamifero implements Voador{

    public Morcego(String especie, Alimentacao alimentacao)
    {
        super(especie,alimentacao);
    }

    @Override
    public void Falar()
    {
        System.out.println("O morcego farfalhar ou trissa: ti ti ti ti ti");
    }

    @Override
    public void Voar()
    {
        System.out.println("O morcego é um dos poucos mamíferos voadores!");
    }


    public void Teste_Protected()
    {
        alimentacao = Alimentacao.carnivoro; // PROTECTED
        especie = "Morcego Grande"; // PRIVATE
    }


}
