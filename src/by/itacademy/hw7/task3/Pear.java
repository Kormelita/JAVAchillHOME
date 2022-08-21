package by.itacademy.hw7.task3;

public class Pear extends Fruit {
    public Pear(String name, double weight, double price) {
        super(name, weight, price);
    }

    @Override
    public double getTotalPrice() {
        return this.getPrice() * this.getWeight();
    }
}
