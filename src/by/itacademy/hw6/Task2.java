package by.itacademy.hw6;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Pattern pat = Pattern.compile("[^0-9]{1,}");
        Matcher match = pat.matcher(str);
        String res = match.replaceAll(" ");
        OptionalInt arr = Arrays.asList(res.split(" ")).stream()
                .mapToInt(s -> s.length())
                .max();
        System.out.println(arr.getAsInt());
    }
}