package jv17_05.pavliuk.lesson10.flower;

public class Chrysanthemum extends Flower {
    public static final int SHELF_LIFE = 3;
    private static int chrysanthemumCounter;

    public Chrysanthemum(String countryOfOrigin) {
        super(countryOfOrigin);
        chrysanthemumCounter++;
    }

    @Override
    public int getCost() {
        return 30;
    }

    @Override
    public String toString() {
        return "Хризантема (хранение: " + SHELF_LIFE + super.toString();
    }

    public static int getChrysanthemumCounter() {
        return chrysanthemumCounter;
    }
}
