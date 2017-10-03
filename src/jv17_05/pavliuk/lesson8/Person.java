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
        System.out.println(fullName + " движется к своей цели");
    }

    public void talk() {
        System.out.println(fullName + " говорит о Java");
    }

    public static void main(String[] args) {
        Person first = new Person();
        Person second = new Person("Александр Павлюк", 35);
        first.talk();
        second.move();
        second.talk();
    }
}
