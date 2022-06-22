package br.com.panvel.modulo9.slides.facade.ingredient;

public abstract class Ingredient {
    protected String name;
    public Ingredient(){name = this.getClass().getName();}
    public String getName(){return name;}
}
