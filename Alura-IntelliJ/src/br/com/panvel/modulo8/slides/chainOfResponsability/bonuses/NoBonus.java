package br.com.panvel.modulo8.slides.chainOfResponsability.bonuses;

import br.com.panvel.modulo8.slides.chainOfResponsability.Salesman;

public class NoBonus extends Bonus{
    public NoBonus() {
        super(null);
    }

    @Override
    protected double applyBonus(Salesman salesman) {
        return 0;
    }

    @Override
    protected  boolean shouldApply(Salesman salesman){
        return true;
    }
}
