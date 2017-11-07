package jv17_05.pavliuk.lesson10.flower;

public class Tulip extends Flower {
    public static final int SHELF_LIFE = 3;
    private static int tulipCounter;

    public Tulip(String countryOfOrigin) {
        super(countryOfOrigin);
        tulipCounter++;
    }

    @Override
    public int getCost() {
        return 20;
    }

    @Override
    public String toString() {
        return "Тюльпан (хранение: " + SHELF_LIFE + super.toString();
    }

    public static int getTulipCounter() {
        return tulipCounter;
    }
}
