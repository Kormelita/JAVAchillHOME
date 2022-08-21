package by.itacademy.hw7.task4;

public class Main {

    public static void main(String[] args) {

        Flower rose = new Rose("Rose", 1.5, 3, "red");
        Flower tulip = new Tulip("Tulip", 1.1, 1, "yellow");
        Flower chamomile = new Chamomile("Chamomile", 0.5, 3, "white");
        Bouquet bouquet = new Bouquet(new Flower[]{rose, chamomile, tulip});
        System.out.println("Total cost: " + bouquet.getTotalCost());
        System.out.println("Bouquet down: " + bouquet.bouquetLifetime());
        System.out.println("Bouguet's colors: " + bouquet.getTotalColors());
    }
}

