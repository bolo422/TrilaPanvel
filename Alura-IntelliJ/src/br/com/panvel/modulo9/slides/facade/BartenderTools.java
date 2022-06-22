package br.com.panvel.modulo9.slides.facade;

import br.com.panvel.modulo9.slides.facade.ingredient.Ingredient;

public class BartenderTools {
    public void steam(Ingredient ingredient)
    {
        System.out.println("Espumando: " + ingredient.getName());
    }

    public void brew(Ingredient ingredient)
    {
        System.out.println("Passando: " + ingredient.getName());
    }

    public void heat(Ingredient ingredient)
    {
        System.out.println("Aquecendo: " + ingredient.getName());
    }

    public void mix(Ingredient[] ingredients)
    {
        StringBuilder str = new StringBuilder("Misutrando: ");
        for(Ingredient i : ingredients)
        {
            str.append(i.getName());
            if(!i.equals(ingredients[ingredients.length-1]))
                str.append(" + ");
        }
        System.out.println(str);
    }
}
