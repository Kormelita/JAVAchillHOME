package by.itacademy.hw2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������ �� �����: ");
        int i = sc.nextInt();
        String a = "��";
        String b = "���";
        a = i % 2 == 0 ? a : b;
        System.out.println(a);
    }
}