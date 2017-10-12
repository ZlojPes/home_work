package jv17_05.pavliuk.lesson11.flower;

public class Rose extends Flower {
    public static final int SHELF_LIFE = 2;
    private static int roseCounter;

    public Rose(String countryOfOrigin) {
        super(countryOfOrigin);
        overallCounter++;
        roseCounter++;
    }

    @Override
    public int getCost() {
        return 50;
    }

    public static int getRoseCounter() {
        return roseCounter;
    }
}
