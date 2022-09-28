package br.com.panvel.modulo9.slides.facade;

import br.com.panvel.modulo9.slides.facade.ingredient.BrewedCoffe;
import br.com.panvel.modulo9.slides.facade.ingredient.CocoaPowder;
import br.com.panvel.modulo9.slides.facade.ingredient.Ingredient;
import br.com.panvel.modulo9.slides.facade.ingredient.Milk;

import static br.com.panvel.modulo9.slides.facade.Drinks.Mocha;

public class BartenderFacade {
    public void order(Drinks drink)
    {
        switch (drink)
        {
            case Mocha:
                BrewedCoffe coffe = new BrewedCoffe();
                Milk milk = new Milk();
                CocoaPowder cocoa = new CocoaPowder();
                BartenderTools tools = new BartenderTools();
                tools.brew(coffe);
                tools.heat(milk);
                tools.steam(milk);
                tools.mix(new Ingredient[]{coffe,milk,cocoa});
            break;
        }
    }
}
