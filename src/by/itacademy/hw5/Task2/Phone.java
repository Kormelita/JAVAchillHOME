package by.itacademy.hw5.Task2;

public class Phone {
    public int number;
    public String model;
    public float weight;


    void receiveCall(String name) {
        System.out.println(name + " calling");
    }

    public int getNumber() {
        return this.number;
    }

    void sendMessage(int... numbers) {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
    void receiveCall(String name, int numberOver) {
        System.out.println(name + " calling. " + numberOver);
    }

    Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    Phone() {

    }
}






