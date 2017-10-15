package jv17_05.pavliuk.lesson11.animals;

public class Horse extends Animal {
    int horsePower;

    public Horse(String food, String location) {
        super(food, location);
        horsePower = 1;
    }

    public void makeNoise() {
        System.out.println("Horse makes noise");
    }

    public void eat() {
        System.out.println("Horse eats " + getFood());
    }

    @Override
    public String toString() {
        return "Horse";
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }
}
