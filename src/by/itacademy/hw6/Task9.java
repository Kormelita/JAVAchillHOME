package by.itacademy.hw6;

import java.util.Scanner;

public class Task9 {
        public static void main(String[] args) {
        System.out.print("Enter your mail: ");
        Scanner sc = new Scanner(System.in);
        String mail = sc.nextLine();
        boolean result = mail.matches("(\\w*)\\S*[@](\\w*)[.]\\D{2,6}");
        if (result) System.out.println("Thank you");
        else {
            System.out.println("It is not correct mail");
        }
    }
}
