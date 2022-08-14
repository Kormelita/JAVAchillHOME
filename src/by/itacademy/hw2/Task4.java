package by.itacademy.hw2;

public class Task4 {
    public static void main(String[] args) {
        upp();
        noupp();
    }
    public static void upp() {
        byte b = 7;
        short s = b;
        int i = s;
        long l = i;
        float f = s;
        double d = i;
        double df = f;
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(df);
    }

    public static void noupp() {
        double d = 123.456;
        long l = 1234567890;
        float f = (float) d;
        int i = (int) d;
        int il = (int) l;
        short s = (short) i;
        byte b = (byte) s;
        System.out.println(d);
        System.out.println(l);
        System.out.println(f);
        System.out.println(i);
        System.out.println(il);
        System.out.println(s);
        System.out.println(b);
    }
}


