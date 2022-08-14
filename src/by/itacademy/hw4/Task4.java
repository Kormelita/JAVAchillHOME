package by.itacademy.hw4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(15);
            System.out.print(arr[i] + " ");

        }
        int max = getMax(arr);
        int indexMax = 0;
        System.out.println("\nМаксимум: " + max);
        int min = getMin(arr);
        int indexMin = 0;
        System.out.println("Минимум: " + min);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[indexMax]) {
                indexMax = i;
            } else if (arr[i] < arr[indexMin]) {
                indexMin = i;
            }
        }
        System.out.println("Их индексы "+ indexMax + " " + indexMin);
    }

    public static int getMax(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

}




