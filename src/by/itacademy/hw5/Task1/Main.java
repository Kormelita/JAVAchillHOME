package by.itacademy.hw5.Task1;

public class Main {
    public static void main(String[] args) {
        Person petrov = new Person();
        petrov.age = 30;
        petrov.fullName = "Petrov Petr Petrovich";
        petrov.move();
        petrov.talk();
        Person ivanov = new Person("Ivanov Ivan Ivanovich", 25);
        ivanov.talk();
        ivanov.move();

    }
}
