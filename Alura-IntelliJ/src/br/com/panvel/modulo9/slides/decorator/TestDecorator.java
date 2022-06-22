package br.com.panvel.modulo9.slides.decorator;

import br.com.panvel.modulo9.slides.decorator.decorators.*;

public class TestDecorator {
    public static void main(String[] args) {

        Pizza basicPizza = new Mozzarella(
                new TomatoSauce(
                        new PlainPizza()
                )
        );

        Pizza chilliPepperoni = new Chili(
                new Pepperoni(
                        new Mozzarella(
                                new TomatoSauce(
                                        new PlainPizza()
                                )
                        )
                )
        );

        Pizza onlyPepperoni = new Pepperoni(new PlainPizza());

        System.out.println(basicPizza.getDescription());
        System.out.println(chilliPepperoni.getDescription());
        System.out.println(onlyPepperoni.getDescription());
    }
}
