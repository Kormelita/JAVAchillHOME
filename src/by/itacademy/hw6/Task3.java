package by.itacademy.hw6;

public class Task3 {

    public static void main(String[] args) {
        String str = "yes it work";
        System.out.println(swap(str));
    }

    public static String getBig(String str) {
        String[] arr = str.replaceAll("\\W+", " ").split(" ");
        StringBuilder sb = new StringBuilder();
        int maxLength = 0;
        for (String string : arr) {
            if (string.length() > maxLength) {
                sb.delete(0, sb.length());
                sb.append(string).append(" ");
                maxLength = string.length();
            }
        }
        return sb.toString().trim();
    }

    public static String getSmall(String str) {
        String[] arr = str.replaceAll("\\W+", " ").split(" ");
        StringBuilder sb = new StringBuilder();
        int minLength = arr[0].length();
        for (String string : arr) {
            if (string.length() <= minLength) {
                sb.delete(0, sb.length());
                sb.append(string).append(" ");
                minLength = string.length();
            }
        }
        return sb.toString().trim();
    }

    public static String swap(String str) {
        String first = getBig(str);
        String last = getSmall(str);
        int indexFirst = str.indexOf(first);
        int indexLast = str.lastIndexOf(last);
        String newString = str.replaceFirst(first, last);
        if (indexFirst < indexLast) {
            indexLast += last.length() - first.length();
        }
        int newStringLength = newString.length();
        newString = newString.substring(0, indexLast).concat(newString.substring(indexLast, newStringLength).replaceFirst(last, first));
        return newString;
    }
}

