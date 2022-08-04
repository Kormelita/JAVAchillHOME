package by.itacademy.hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i % 2 != 0 && i > 0) {
            System.out.println("Ваше число нечетное положительное");
        } else if (i % 2 == 0 && i < 0) {
            System.out.println("Ваше число четное отрицательное");
        }
    }
}

