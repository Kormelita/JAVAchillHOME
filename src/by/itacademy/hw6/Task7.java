package by.itacademy.hw6;

public class Task7 {

    public static void main(String[] args) {

        Double d1 = Double.valueOf(12.3);
        Double d2 = Double.valueOf(4.56);
        System.out.println(d1);
        System.out.println(d2);

        System.out.println(stringToDouble("78.9"));

        primitive(d2);

        String d = Double.toString(Double.valueOf(3.14));
        System.out.println(d);
    }

    public static void primitive(Double d2) {

        byte b = d2.byteValue();
        short s = d2.shortValue();
        int i = d2.intValue();
        long l = d2.longValue();
        float f = d2.floatValue();
        double d = d2;

        System.out.println("byte : " + b);
        System.out.println("short : " + s);
        System.out.println("int : " + i);
        System.out.println("long : " + l);
        System.out.println("float : " + f);
        System.out.println("double : " + d);

    }

    public static double stringToDouble(String str) {
        return Double.parseDouble(str);
    }

}