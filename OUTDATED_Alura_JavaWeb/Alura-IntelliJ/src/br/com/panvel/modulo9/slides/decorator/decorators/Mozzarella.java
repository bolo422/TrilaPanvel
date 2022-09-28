package br.com.panvel.modulo9.slides.decorator.decorators;

import br.com.panvel.modulo9.slides.decorator.Pizza;

public class Mozzarella extends ToppingDecorator {
    public Mozzarella(Pizza newPizza) {
        super(newPizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", queijo mozzarella";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2.00;
    }
}
