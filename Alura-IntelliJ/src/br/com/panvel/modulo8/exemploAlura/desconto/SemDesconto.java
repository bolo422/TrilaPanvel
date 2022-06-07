package br.com.panvel.modulo8.exemploAlura.desconto;

import br.com.panvel.modulo8.exemploAlura.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto {

    SemDesconto()
    {
        super(null);
    }

    @Override
    protected BigDecimal efetuarCalculo(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    @Override
    protected boolean deveAplicar(Orcamento orcamento) {
        return true;
    }
}


