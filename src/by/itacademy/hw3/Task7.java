package by.itacademy.hw3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = sc.nextInt();
        System.out.print("Введите второе число: ");
        int b = sc.nextInt();
        if (a >= 10 | b >= 10 | a <= -10 | b <= -10) {
            System.out.println("Числа должны быть однозначными");
            return;
        } else System.out.print("Укажите результат произведения: ");
        int ans = sc.nextInt();
        int c = a * b;
        if (ans == c) {
            System.out.println("Правильно!");
        } else System.out.println("Увы, правильный ответ " + c);
    }
}

