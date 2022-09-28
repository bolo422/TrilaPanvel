package br.com.panvel.modulo8.slides.chainAndTemplate.bonuses;

import br.com.panvel.modulo8.slides.chainAndTemplate.Salesman;

public class SalesBonus extends Bonus{
    public SalesBonus(Bonus next) {
        super(next);
    }

    @Override
    protected double applyBonus(Salesman salesman) {

        return salesman.getSalary() * 0.2;

    }

    @Override
    protected  boolean shouldApply(Salesman salesman){
        return salesman.getSales() >= 5000;
    }
}
