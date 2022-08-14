package by.itacademy.hw2;

public class Task3 {
    public static void main(String[] args) {
        int s = 604800;
        int m = s / 60;
        int h = m / 60;
        int d = h / 24;
        int w = d / 7;
        System.out.print(w + " неделя " + d + " сутки " + h + " часы " + m + " минуты " + s + " сeкунды");
    }
}
