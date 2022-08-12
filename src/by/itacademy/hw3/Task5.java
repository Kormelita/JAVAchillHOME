package by.itacademy.hw3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a > 59 || a < 0) {
            System.out.println("Ошибка");
            return;
        } else if (a == 0 || a == 15 || a == 30 || a == 45) {
            System.out.println("Пересечение четвертей");
            return;
        }
        if (a <= 14) {
            System.out.println("Первая четверть");
        } else if (a <= 29) {
            System.out.println("Вторая четверть");
        } else if (a <= 44) {
            System.out.println("Третья четверть");
        } else {
            System.out.println("Четвертая четверть");
        }
    }
}
