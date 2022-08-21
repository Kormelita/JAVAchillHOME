package by.itacademy.hw7.task2;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double value = sc.nextDouble();

        Celsius celsi = new Celsius(value);

        Kelvin kelvi = new Kelvin(celsi.getValue());
        Farenheit fahren = new Farenheit(celsi.getValue());
        System.out.println(kelvi.Convertion() + " Kelvin");
        System.out.println(fahren.Convertion() + " Farenheit");
    }
}
