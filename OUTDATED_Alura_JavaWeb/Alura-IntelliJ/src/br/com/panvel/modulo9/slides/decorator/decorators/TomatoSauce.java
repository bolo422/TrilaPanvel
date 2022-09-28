package br.com.panvel.modulo9.slides.decorator.decorators;

import br.com.panvel.modulo9.slides.decorator.Pizza;

public class TomatoSauce extends ToppingDecorator {
    public TomatoSauce(Pizza newPizza) {
        super(newPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", molho de tomate";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.75;
    }
}
