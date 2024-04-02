import coffeeMachin.*;
import menu.Menu;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Coffee espresso = new Espresso();
        Coffee mokkachino = new Mokkachino();
        Coffee americano = new Americano();
        Coffee raf = new Raf();
        Scanner cons = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println(Menu.collTheMenu);
            String number = cons.nextLine();
            if (cons.hasNextLine()) {
                switch (number) {
                    case "1":
                        espresso.makeCoffee("Спасибо за покупку.");
                        break;
                    case "2":
                        mokkachino.makeCoffee("Отличный выбор.");
                        break;
                    case "3":
                        americano.makeCoffee("Спасибо.");
                        break;
                    case "4":
                        raf.makeCoffee("Приходите еще.");
                        break;
                    case "777":
                        System.out.println("Goodbye");
                        flag = false;
                        break;
                    default:
                        System.err.println("Ошибка. Введено некорректное значение. Попробуйте снова.");
                }
            }
        }
    }
}





