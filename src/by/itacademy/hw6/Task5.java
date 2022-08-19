package by.itacademy.hw6;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task5 {
    public static void main(String[] args) {
        String text = "Object-oriented programming is a bla bla \"actions\" and bla bla. Object-oriented programming blabla. Object-oriented programming bla.";
        System.out.println(text);
        System.out.println(replace(text, "Object-oriented programming", "OOP"));
    }

    public static String replace(String text, String change, String result) {
        StringBuilder sb = new StringBuilder();
        Pattern p = Pattern.compile(change, Pattern.CASE_INSENSITIVE);
        Matcher matcher = p.matcher(text);
        int count = 0;
        while (matcher.find()) {
            if ((count++) % 2 != 0) {
                matcher.appendReplacement(sb, result);
            }
        }
        matcher.appendTail(sb);
        return sb.toString();
    }
}
