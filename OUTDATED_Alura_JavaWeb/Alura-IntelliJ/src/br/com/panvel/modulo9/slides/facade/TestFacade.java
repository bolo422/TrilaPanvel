package br.com.panvel.modulo9.slides.facade;

import br.com.panvel.modulo9.slides.facade.ingredient.BrewedCoffe;
import br.com.panvel.modulo9.slides.facade.ingredient.CocoaPowder;
import br.com.panvel.modulo9.slides.facade.ingredient.Ingredient;
import br.com.panvel.modulo9.slides.facade.ingredient.Milk;

import java.util.Arrays;

import static br.com.panvel.modulo9.slides.facade.Drinks.Mocha;

public class TestFacade {
    public static void main(String[] args) {

        //region Sem Facade
        System.out.println("Cliente: Quero fazer um moccaccino...");
        BrewedCoffe coffe = new BrewedCoffe();
        Milk milk = new Milk();
        CocoaPowder cocoa = new CocoaPowder();
        BartenderTools tools = new BartenderTools();

        tools.brew(coffe);
        tools.heat(milk);
        tools.steam(milk);
        tools.mix(new Ingredient[]{coffe,milk,cocoa});
        //endregion
        System.out.println("\n-----------\n");
        //region Com Facade
        System.out.println("Cliente: Quero fazer um moccaccino...");
        BartenderFacade bartender = new BartenderFacade();
        bartender.order(Mocha);
        //endregion
    }
}
