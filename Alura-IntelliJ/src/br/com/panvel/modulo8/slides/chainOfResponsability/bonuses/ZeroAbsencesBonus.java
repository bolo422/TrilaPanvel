package br.com.panvel.modulo8.slides.chainOfResponsability.bonuses;

import br.com.panvel.modulo8.slides.chainOfResponsability.Salesman;

public class ZeroAbsencesBonus extends Bonus{
    public ZeroAbsencesBonus(Bonus next) {
        super(next);
    }

    protected double applyBonus(Salesman salesman) {
        return salesman.getSalary() * 0.1;
    }

    @Override
    protected  boolean shouldApply(Salesman salesman){
        return salesman.getAbsences() <= 0;
    }
}
