package by.itacademy.hw6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {
    public static void main(String[] args) {
        String str = "Versions: Java  5, Java 6, Java 7, Java 8, Java 12.";
        Pattern pat = Pattern.compile("Java(\\s*\\w*)");
        Matcher mat = pat.matcher(str);
        while (mat.find())
            System.out.println(mat.group());
    }
}