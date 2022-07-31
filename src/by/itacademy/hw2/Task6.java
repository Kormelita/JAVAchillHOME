package by.itacademy.hw2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int i = (a < b && a < b && a < c) ? a : b;
        int d = (i < c) ? i : c;

        System.out.println(d);
    }
}

