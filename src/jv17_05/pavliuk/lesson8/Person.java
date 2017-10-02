package jv17_05.pavliuk.lesson8;

public class Person {
    String fullName;
    int age;

    public Person() {
        fullName = "Not specified";
        age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public static void main(String[] args) {
        Person first = new Person();
        Person second = new Person("Александр Павлюк", 35);
    }
}