package by.itacademy.hw7.task2;
public class Kelvin {

    static final double kelvinConst = 273.15;

    protected double value;

    public Kelvin() {
    }

    public Kelvin(double value) {
        this.value = value;
    }

    protected double Convertion() {
        return kelvinConst + value;
    }
}