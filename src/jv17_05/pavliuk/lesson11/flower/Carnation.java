package jv17_05.pavliuk.lesson11.flower;

public class Carnation extends Flower {
    public static final int SHELF_LIFE = 3;
    private static int carnationCounter;

    public Carnation(String countryOfOrigin) {
        super(countryOfOrigin);
        overallCounter++;
        carnationCounter++;
    }

    @Override
    public int getCost() {
        return 30;
    }

    public static int getCarnationCounter() {
        return carnationCounter;
    }
}
