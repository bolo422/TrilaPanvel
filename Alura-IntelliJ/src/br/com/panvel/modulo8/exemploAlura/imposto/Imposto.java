package br.com.panvel.modulo8.exemploAlura.imposto;

import br.com.panvel.modulo8.exemploAlura.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    public BigDecimal calcular(Orcamento orcamento);
    public default BigDecimal calcular(Orcamento orcamento, BigDecimal aliquota)
    {
        return orcamento.getValor().multiply(aliquota);
    }
}