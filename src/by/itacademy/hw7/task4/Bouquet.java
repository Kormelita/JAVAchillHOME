package by.itacademy.hw7.task4;
//4. Реализовать иерархию цветов (розы, ромашки и т.п.).
//Создать несколько объектов-цветов.
//Собрать букет и определить его стоимость.
//Определить все цвета, используемые в букете.
//Определить когда весь букет завянет.

public class Bouquet {

    private final Flower[] flowers;

    public Bouquet(Flower[] flowers) {
        this.flowers = flowers;
    }

    public int bouquetLifetime() {
        int bouquetLifetime = flowers[0].getLife();
        for (int i = 1; i < flowers.length; i++) {
            if (bouquetLifetime < flowers[i].getLife()) {
                bouquetLifetime = flowers[i].getLife();
            }
        }
        return bouquetLifetime;
    }

    public double getTotalCost() {
        double total = 0.0;
        for (Flower fl : flowers) {
            total = total + fl.getCost();
        }
        return total;
    }

    public String getTotalColors() {
        String colors = null;
        for (Flower fl : flowers) {
            colors = fl.getColor();
        }
        return colors;
    }
}

