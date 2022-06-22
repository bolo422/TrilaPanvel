package br.com.panvel.modulo9.slides.decorator;

public class PlainPizza implements Pizza{
    @Override
    public String getDescription() {
        return "Massa premium";
    }

    @Override
    public double getCost() {
        return 5.00;
    }
}
