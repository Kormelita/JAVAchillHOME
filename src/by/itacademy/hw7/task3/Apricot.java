package by.itacademy.hw7.task3;

public class Apricot extends Fruit {
    public Apricot(String name, double weight, double price) {
        super(name, weight, price);
    }

    @Override
    public double getTotalPrice() {
        return this.getPrice() * this.getWeight();
    }
}
