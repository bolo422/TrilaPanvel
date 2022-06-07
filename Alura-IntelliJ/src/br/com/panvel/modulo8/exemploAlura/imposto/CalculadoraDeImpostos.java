package br.com.panvel.modulo8.exemploAlura.imposto;

import br.com.panvel.modulo8.exemploAlura.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto)
    {
        return imposto.calcular(orcamento);
    }
}


