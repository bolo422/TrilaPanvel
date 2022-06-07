package br.com.panvel.modulo8.slides.chainOfResponsability.bonuses;

import br.com.panvel.modulo8.slides.chainOfResponsability.Salesman;

public abstract class Bonus {

    protected Bonus next;

    public Bonus(Bonus next)
    {
        this.next = next;
    }

    public double bonus(Salesman salesman)
    {
        if(shouldApply(salesman))
            return applyBonus(salesman);

        return next.bonus(salesman);
    }
    protected abstract double applyBonus(Salesman salesman);
    protected abstract boolean shouldApply(Salesman salesman);
}


