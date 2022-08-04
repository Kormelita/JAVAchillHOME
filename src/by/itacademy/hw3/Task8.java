package by.itacademy.hw3;

import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(0, 28800);
        int h = n / 60 / 60;
        int h1 = 0;
        int s = n % 60;
        h1 = (n - s) / 60;
        int m = h1 % 60;
                System.out.println("Иванову домой через: " + n + " секунд");
        if (h > 0) {
            System.out.println("Остальным через: " + h + " часа");
        } else System.out.println("Остальным через: " + m + " минут");
    }
}