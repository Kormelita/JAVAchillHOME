package by.itacademy.hw2;

public class Task4 {
    public static void main(String[] args) {

    }

    static {
        double d = 123.456;
        float f = (float) d;
        System.out.println(d);
        System.out.println(f);
    }

    static {
        double d = 123.456;
        int i = (int) d;
        System.out.println(d);
        System.out.println(i);
    }

    static {
        long l = 1234567890;
        int i = (int) l;
        System.out.println(l);
        System.out.println(i);
    }

    static {
        int i = 123456789;
        short s = (short) i;
        System.out.println(i);
        System.out.println(s);
    }

    static {
        short s = 12345;
        byte b = (byte) s;
        System.out.println(s);
        System.out.println(b);
    }

    static {
        int i = 0;
        char c = (char) i;
        System.out.println(i);
        System.out.println(c);
    }
}
