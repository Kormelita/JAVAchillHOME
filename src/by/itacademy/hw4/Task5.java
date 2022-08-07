package by.itacademy.hw4;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(15);
            System.out.print(arr[i] + " ");

        }
        int min = getMin(arr);
        System.out.println("Минимум: " + min);
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                if (arr[i] < min)
                    min = arr[i];
                }else continue;
            }
            return min;
        }

    }