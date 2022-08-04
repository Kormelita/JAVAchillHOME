package by.itacademy.hw2;

public class Task3 {
    public static void main(String[] args) {

        int x = 604800;
        int s = x % 60;
        x = (x - s) / 60;
        int m = x % 60;
        x = (x - m) / 60;
        int h = x % 24;
        x = (x - h) / 24;
        int d = x % 7;
        x = (x - d) / 7;
        int w = x;
        System.out.print(w + " неделя " + d + " сутки " + h + " часы " + m + " минуты " + s + " сeкунды");
    }
}
