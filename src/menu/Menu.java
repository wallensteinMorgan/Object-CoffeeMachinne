package menu;

import coffeeMachin.FullIngredients;

import java.util.Scanner;

public class Menu {
      public static void noIngredients(){
            Scanner cons = new Scanner(System.in);
            System.err.println("Ошибка, ингредиентов недостаточно. Пополнить? 1 - да, 2 -нет");
            int number = cons.nextInt();
            if (number == 1) {
                  FullIngredients.fullIngredients();
            } else if (number == 2) {
                  System.out.println("Вы вернулись в главное меню");
            }
      }
      public  static  String collTheMenu = ("Меню:\n"+
              "Нажмите 1, чтобы выбрать эспрессо.\n"+
              "Нажмите 2 чтобы выбрать моккачино.\n"+
              "Нажмите 3, чтобы выбрать американо.\n"+
              "Нажмите 4, чтобы выбрать раф.\n"+
              "Введи код, чтобы выключить кофемашину");
}
