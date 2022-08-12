package by.itacademy.hw3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Первое число: ");
        int a = sc.nextInt();
        System.out.print("Второе число: ");
        int b = sc.nextInt();
        if (a >= 10 | b >= 10 | a <= -10 | b <= -10) {
            System.out.println("Только однозначные числа");
            return;
        } else System.out.print("Ваш ответ: ");
        int ans = sc.nextInt();
        int c = a * b;
        if (ans == c) {
            System.out.println("Правильно!");
        } else System.out.println("Неправильно, это " + c);
    }
}

