package by.itacademy.hw7.task2;

public class Farenheit extends Kelvin {

    public Farenheit() {
    }

    public Farenheit(double value) {
        super.value = value;
    }

    @Override
    protected double Convertion() {
        return (value * 1.8 + 32.0);
    }
}