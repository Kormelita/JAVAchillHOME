package by.itacademy.hw7.task3;

public class Apple extends Fruit {
    public Apple(String name, double weight, double price) {
        super(name, weight, price);
    }

    @Override
    public double getTotalPrice() {
        return this.getPrice() * this.getWeight();
    }
}
