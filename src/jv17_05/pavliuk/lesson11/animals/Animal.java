package jv17_05.pavliuk.lesson11.animals;

public class Animal {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("Animal makes noise");
    }

    public void eat() {
        System.out.println("Animal eats");
    }

    public void sleep() {
        System.out.println("Animal sleeps");
    }
}
