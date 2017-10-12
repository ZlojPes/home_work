package jv17_05.pavliuk.lesson11.flower;

public class Chrysanthemum extends Flower {
    public static final int SHELF_LIFE = 3;
    private static int chrysanthemumCounter;

    public Chrysanthemum(String countryOfOrigin) {
        super(countryOfOrigin);
        overallCounter++;
        chrysanthemumCounter++;
    }

    @Override
    public int getCost() {
        return 30;
    }

    public static int getChrysanthemumCounter() {
        return chrysanthemumCounter;
    }
}
