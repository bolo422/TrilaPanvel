package br.com.panvel.modulo8.slides.chainOfResponsability.bonuses;

import br.com.panvel.modulo8.slides.chainOfResponsability.Salesman;

public class AvarageEvaluationBonus extends Bonus{
    public AvarageEvaluationBonus(Bonus next) {
        super(next);
    }

    @Override
    protected double applyBonus(Salesman salesman) {
        return salesman.getSalary() * 0.15;
    }

    @Override
    protected  boolean shouldApply(Salesman salesman){
        return salesman.getAvarageEvaluation() >= 4;
    }
}
