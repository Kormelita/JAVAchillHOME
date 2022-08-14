package by.itacademy.hw4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int com = 1;
        while (n != 0) {

            sum += (n % 10);
            com *= (n % 10);
            n /= 10;
        }
        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + com);
    }
}
