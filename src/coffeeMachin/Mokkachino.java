package coffeeMachin;

import ingredients.Ingredients;

import java.util.Scanner;

public class Mokkachino implements Coffee{
    @Override
    public void makeCoffee(String name) {
        System.out.println("Вы выбрали моккачино " + name);
        Scanner cons = new Scanner(System.in);
        if ((Ingredients.water < 4) || (Ingredients.coffeeBeans < 9) || (Ingredients.milk < 9)) {
            System.err.println("Ошибка, ингредиентов недостаточно. Пополнить? 1 - да, 2 -нет");
            int number = cons.nextInt();
            if (number == 1) {
                FullIngredients.fullIngredients();
            } else if (number == 2) {
                System.out.println("Вы вернулись в главное меню");
            }
        }else {
            Ingredients.water = Ingredients.water - 10;
            Ingredients.milk = Ingredients.milk - 10;
            Ingredients.coffeeBeans = Ingredients.coffeeBeans - 10;
        }
    }
}
