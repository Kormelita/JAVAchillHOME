package by.itacademy.hw4;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt();
            System.out.print(arr[i] + " ");
        }
        int plus = 0;
        int minus = 0;
        for (int k : arr) {
            if (k > 0) {
                plus++;
            } else {
                minus++;
            }
        }
        int[] arrplus = new int[plus];
        int[] arrminus = new int[minus];
        int countplus = 0;
        int countminus = 0;
        for (int j : arr) {
            if (j > 0) {
                arrplus[countplus] = j;
                countplus++;
            } else {
                arrminus[countminus] = j;
                countminus++;
            }
        }
        System.out.println("\nNegativ: ");
        for (int j : arrminus) {

            System.out.print(j + " ");
        }
        System.out.println("\nPositiv: ");
        for (int arrpo : arrplus) {

            System.out.print(arrpo + " ");
        }

    }
}