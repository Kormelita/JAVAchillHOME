package by.itacademy.hw3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a > b && b > c) {
            System.out.println(a + " " + b + " " + c);
        } else if (b > a && b > c) {
            System.out.println(b + " " + c + " " + a);
        } else if (c > a && c > b) {
            System.out.println(c + " " + b + " " + a);
        } else if (a > b && c > b) {
            System.out.println(a + " " + c + " " + b);
        }
    }
}


