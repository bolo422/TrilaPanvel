package br.com.panvel.modulo9.slides.decorator.decorators;

import br.com.panvel.modulo9.slides.decorator.Pizza;

public class Pepperoni extends ToppingDecorator {
    public Pepperoni(Pizza newPizza) {
        super(newPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", calabresa";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.00;
    }
}
