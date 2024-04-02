package coffeeMachin;

import ingredients.Ingredients;
import menu.Menu;

import java.util.Scanner;

public class Raf implements Coffee {
    @Override
    public void makeCoffee(String name) {
        System.out.println("Вы выбрали раф " + name);
        Scanner cons = new Scanner(System.in);
        if ((Ingredients.water < 4) || (Ingredients.coffeeBeans < 9) || (Ingredients.milk < 19)) {
            Menu.noIngredients();
        } else {
            Ingredients.water = Ingredients.water - 5;
            Ingredients.milk = Ingredients.milk - 20;
            Ingredients.coffeeBeans = Ingredients.coffeeBeans - 10;
        }
    }
}
