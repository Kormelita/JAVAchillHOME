package by.itacademy.hw3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a > 59 || a < 0) {
            System.out.println("������");
            return;
        } else if (a == 0 || a == 15 || a == 30 || a == 45) {
            System.out.println("����������� ���������");
            return;
        }
        if (a <= 14) {
            System.out.println("������ ��������");
        } else if (a <= 29) {
            System.out.println("������ ��������");
        } else if (a <= 44) {
            System.out.println("������ ��������");
        } else {
            System.out.println("��������� ��������");
        }
    }
}
