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
        while (true) {
            System.out.println(Menu.collTheMenu);
        int number = cons.nextInt();
            if (number == 1) {
                espresso.makeCoffee("Спасибо за покупку.");
            } else if (number == 2) {
                mokkachino.makeCoffee("Отличный выбор.");
            } else if (number == 3) {
                americano.makeCoffee("Спасибо.");
            } else if (number == 4) {
                raf.makeCoffee("Приходите еще.");
            } else if (number == 777) {
                break;
            }
        }
    }
}


