package by.itacademy.hw5.Task2;

public class Main {
    public static void main(String[] args) {
Phone x = new Phone();
x.model = "Xiaomi";
x.number = 123456789;
x.weight = 120;

x.receiveCall("Petrov");
x.getNumber();
x.sendMessage(987654321);
x.receiveCall("Ivanov", 234567891);
Phone h = new Phone(345678912, "Honor");
Phone i = new Phone(456789123, "iPhone", 240);
    }
}