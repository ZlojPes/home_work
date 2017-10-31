package jv17_05.pavliuk.lesson8;

public class Person {
    String fullName;
    int age;

    public Person() {
        fullName = "NoName";
        age = 0;
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " is moving towards his goal");
    }

    public void talk() {
        System.out.println(fullName + " talks about Java");
    }

    @Override
    public String toString() {
        return String.format("Person: %-20s age: %d", fullName, age);
    }

    public static void main(String[] args) {
        Person first = new Person();
        Person second = new Person("Alexander Pavliuk", 35);
        first.talk();
        second.move();
        second.talk();
        System.out.println(first);
        System.out.println(second);
    }
}
