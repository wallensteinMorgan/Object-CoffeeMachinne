package coffeeMachin;

import ingredients.Ingredients;
import menu.Menu;

import java.util.Scanner;

public class Espresso implements Coffee{
    @Override
    public void makeCoffee(String name) {
        System.out.println("Вы выбрали эспрессо " + name );
        Scanner cons = new Scanner(System.in);
        if ((Ingredients.water < 4) || (Ingredients.coffeeBeans < 9) || (Ingredients.milk < 19)) {
            Menu.noIngredients();
        }else {
            Ingredients.water = Ingredients.water - 5;
            Ingredients.coffeeBeans = Ingredients.coffeeBeans - 20;
        }
    }
}
