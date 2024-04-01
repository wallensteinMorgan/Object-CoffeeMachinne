package coffeeMachin;

import ingredients.Ingredients;

public class FullIngredients {
     public static void fullIngredients() {
        Ingredients.water = Ingredients.water + 100;
        Ingredients.milk  = Ingredients.milk + 100;
        Ingredients.coffeeBeans = Ingredients.coffeeBeans + 300;
    }
}
