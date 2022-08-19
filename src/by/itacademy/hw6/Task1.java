package by.itacademy.hw6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.trim();
        str = str.replaceAll("\s+", " ");
        System.out.println(str);

    }
}
