package by.itacademy.hw3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a>b+c||b>a+c||c>a+b){
            System.out.println("Такого треугольника не сущесвтует");
        }else System.out.println("Сущесвтует");
    }
}
