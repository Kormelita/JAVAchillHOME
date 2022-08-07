package by.itacademy.hw4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.print("Ваше число: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        long f = 1;
        int a = 1;
        while (a < i) {
            a++;
            f *= a;
        }
        System.out.println("Факториал " + i + " равен " + f);
    }
}
