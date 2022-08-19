package by.itacademy.hw6;

import java.util.Scanner;

public class Task8 {
   /* Шестнадцатеричный цвет. Символ # (необязательно),
   затем слово, состоящее из букв от a до f или цифр, длиной 3 или 6:
    Пример:
    FFFFFF
 #000
         101011
*/
    public static void main(String[] args) {

        String regExpress = "^#?([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$";
        Scanner sc = new Scanner(System.in);
        String color = sc.nextLine();
        if (color.matches(regExpress)) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
    }
}

