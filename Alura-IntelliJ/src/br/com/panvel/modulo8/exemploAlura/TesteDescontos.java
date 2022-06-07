package br.com.panvel.modulo8.exemploAlura;

import br.com.panvel.modulo8.exemploAlura.desconto.CalculadoraDeDescontos;
import br.com.panvel.modulo8.exemploAlura.imposto.CalculadoraDeImpostos;
import br.com.panvel.modulo8.exemploAlura.imposto.ICMS;
import br.com.panvel.modulo8.exemploAlura.imposto.ISS;
import br.com.panvel.modulo8.exemploAlura.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDescontos {
    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento(new BigDecimal("200"), 6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("800"), 3);
        Orcamento orcamento3 = new Orcamento(new BigDecimal("100"), 2);

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();

        System.out.println("orcamento1: " + calculadora.calcular(orcamento1));
        System.out.println("orcamento2: " + calculadora.calcular(orcamento2));
        System.out.println("orcamento3: " + calculadora.calcular(orcamento3));

    }
}



