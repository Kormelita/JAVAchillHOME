package by.itacademy.hw3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("������� ������ �����: ");
        int a = sc.nextInt();
        System.out.print("������� ������ �����: ");
        int b = sc.nextInt();
        if (a >= 10 | b >= 10 | a <= -10 | b <= -10) {
            System.out.println("����� ������ ���� ������������");
            return;
        } else System.out.print("������� ��������� ������������: ");
        int ans = sc.nextInt();
        int c = a * b;
        if (ans == c) {
            System.out.println("���������!");
        } else System.out.println("���, ���������� ����� " + c);
    }
}

