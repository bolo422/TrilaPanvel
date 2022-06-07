package br.com.panvel.modulo8.exemploAlura.desconto;

import br.com.panvel.modulo8.exemploAlura.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento){
        Desconto desconto = new DescontoQuantidade(
                new DescontoValor(
                        new SemDesconto()));

        return desconto.calcular(orcamento);
    }
}

