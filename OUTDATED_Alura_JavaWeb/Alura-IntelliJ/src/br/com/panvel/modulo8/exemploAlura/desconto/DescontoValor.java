package br.com.panvel.modulo8.exemploAlura.desconto;

import br.com.panvel.modulo8.exemploAlura.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoValor extends Desconto{

    public DescontoValor(Desconto proximo){
        super(proximo);
    }

    @Override
    protected BigDecimal efetuarCalculo(Orcamento orcamento)
    {
        return  orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    protected boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}

