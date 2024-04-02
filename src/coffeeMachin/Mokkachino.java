package coffeeMachin;

import ingredients.Ingredients;
import menu.Menu;

import java.util.Scanner;

public class Mokkachino implements Coffee{
    @Override
    public void makeCoffee(String name) {
        System.out.println("Вы выбрали моккачино " + name);
        Scanner cons = new Scanner(System.in);
        if ((Ingredients.water < 4) || (Ingredients.coffeeBeans < 9) || (Ingredients.milk < 9)) {
            Menu.noIngredients();
        }else {
            Ingredients.water = Ingredients.water - 10;
            Ingredients.milk = Ingredients.milk - 10;
            Ingredients.coffeeBeans = Ingredients.coffeeBeans - 10;
        }
    }
}
