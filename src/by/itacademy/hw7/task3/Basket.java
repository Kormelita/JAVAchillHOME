package by.itacademy.hw7.task3;

public class Basket {
    private final Fruit[] fruit;
    double total = 0;

    public Basket(Fruit[] fruit) {
        this.fruit = fruit;
    }

    public void totalPriceByFruits() {
        for (Fruit juicy : fruit) {
            System.out.print("\n" + juicy.getWeight() + " kg " + juicy.getName() + " cost: " + juicy.getTotalPrice() + " ");
            juicy.printManufacturerInfo();
            total = total + juicy.getTotalPrice();
        }
        System.out.println("\n" + "Total price: " + total);
    }
}