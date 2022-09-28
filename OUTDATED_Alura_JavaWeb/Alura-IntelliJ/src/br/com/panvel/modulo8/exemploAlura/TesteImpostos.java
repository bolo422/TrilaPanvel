package br.com.panvel.modulo8.exemploAlura;

import br.com.panvel.modulo8.exemploAlura.imposto.CalculadoraDeImpostos;
import br.com.panvel.modulo8.exemploAlura.imposto.ICMS;
import br.com.panvel.modulo8.exemploAlura.imposto.ISS;
import br.com.panvel.modulo8.exemploAlura.imposto.TipoImposto;
import br.com.panvel.modulo8.exemploAlura.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println("ICMS: " + calculadora.calcular(orcamento, new ICMS()));
        System.out.println("ISS: " + calculadora.calcular(orcamento, new ISS()));
    }
}



