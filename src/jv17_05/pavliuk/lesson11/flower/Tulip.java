package jv17_05.pavliuk.lesson11.flower;

public class Tulip extends Flower {
    public static final int SHELF_LIFE = 2;
    private static int tulipCounter;

    public Tulip(String countryOfOrigin) {
        super(countryOfOrigin);
        overallCounter++;
        tulipCounter++;
    }

    @Override
    public int getCost() {
        return 20;
    }

    public static int getTulipCounter() {
        return tulipCounter;
    }
}
