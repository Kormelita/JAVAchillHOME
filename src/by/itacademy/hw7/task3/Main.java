package by.itacademy.hw7.task3;

public class Main {
    public static void main(String[] args) {

        Apple mutsu = new Apple("Apple", 1.2, 3.74);
        Pear california = new Pear("Pear", 1.8, 3.12);
        Apricot azer = new Apricot("Apricot", 1.54, 7.99);

        Basket basket = new Basket(new Fruit[]{mutsu, california, azer});
        basket.totalPriceByFruits();
    }
}

