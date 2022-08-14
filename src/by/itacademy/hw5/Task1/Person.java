package by.itacademy.hw5.Task1;

public class Person {
    public String fullName;
    public int age;

    void move() {
        System.out.println("User " + fullName + " gone");
    }

    void talk() {
        System.out.println("User " + fullName + " talk");
    }

    public Person() {

    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }
}



