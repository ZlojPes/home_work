package jv17_05.pavliuk.lesson11.animals;

public class Vet {

    public static void main(String[] args) {
        Cat cat = new Cat("Whiskas", "Kharkov", 80);
        Dog dog = new Dog("Pedigree", "Kiev", true);
        Horse horse = new Horse("grass", "Odessa");
        Animal[] animals = {cat, dog, horse};
        for (Animal animal : animals) {
            treatAnimal(animal);
        }
    }

    private static void treatAnimal(Animal animal) {
        System.out.println("animal: " + animal + ", food: " + animal.getFood() + ", location: " + animal.getLocation());
    }
}
