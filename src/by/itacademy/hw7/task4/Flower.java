package by.itacademy.hw7.task4;

abstract class Flower {
    private String name;
    private double cost;
    private int life;
    private String color;

    public Flower(String name, double cost, int life, String color) {
        this.name = name;
        this.cost = cost;
        this.life = life;
        this.color = color;
    }

    public double getCost() {
        return cost;
    }

    public int getLife() {
        return life;
    }
    public String getColor() {
        return color;
    }

}

