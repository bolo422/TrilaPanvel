package br.com.panvel.modulo9.slides.decorator.decorators;

import br.com.panvel.modulo9.slides.decorator.Pizza;

public class Chili extends ToppingDecorator {
    public Chili(Pizza newPizza) {
        super(newPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", pimenta";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.50;
    }
}
