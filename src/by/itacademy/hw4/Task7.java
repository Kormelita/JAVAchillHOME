package by.itacademy.hw4;

import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(15);
            System.out.print(arr[i] + " ");
        }

        int[] revarr = new int[arr.length];
        for (int i = arr.length - 1; i > 0; ) {
            for (int j = 0; j < arr.length; j++) {
                revarr[j] = arr[i];
                i--;
                System.out.print(revarr[j] + " ");
            }
        }
    }
}

