package by.itacademy.hw4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ваш множитель: ");
        int x = sc.nextInt();
        int y = 1;
        int z = 0;
        do {
            z = x * y;
            System.out.println(x + "x" + y + "=" + z);
            y++;
        } while (y <= 10);
    }
}

