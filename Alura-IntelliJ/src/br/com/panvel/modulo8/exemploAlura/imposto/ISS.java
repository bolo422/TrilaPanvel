package br.com.panvel.modulo8.exemploAlura.imposto;

import br.com.panvel.modulo8.exemploAlura.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS implements Imposto{
    @Override
    public BigDecimal calcular(Orcamento orcamento)
    {
        return calcular(orcamento, new BigDecimal("0.06"));
    }
}

