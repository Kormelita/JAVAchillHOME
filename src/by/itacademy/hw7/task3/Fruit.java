package by.itacademy.hw7.task3;

abstract class Fruit {

    private double weight;
    private double priceKg;
    private final String name;

    public Fruit(String name, double weight, double priceKg) {
        this.name = name;
        this.weight = weight;
        this.priceKg = priceKg;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return priceKg;
    }
    public void printManufacturerInfo() {
        System.out.print("Made in Belarus");
    }

    public abstract double getTotalPrice();

}



