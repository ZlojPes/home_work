package jv17_05.pavliuk.lesson11.animals;

public class Dog extends Animal {
    private boolean isTrained;

    public Dog(String food, String location, boolean isTrained) {
        super(food, location);
        this.isTrained = isTrained;
    }

    public void makeNoise() {
        System.out.println("Dog makes noise");
    }

    public void eat() {
        System.out.println("Dog eats " + getFood());
    }

    @Override
    public String toString() {
        return "Dog";
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }

    public boolean isTrained() {
        return isTrained;
    }
}
