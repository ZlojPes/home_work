package jv17_05.pavliuk.lesson10.flower;

public class Carnation extends Flower {
    public static final int SHELF_LIFE = 3;
    private static int carnationCounter;

    public Carnation(String countryOfOrigin) {
        super(countryOfOrigin);
        carnationCounter++;
    }

    @Override
    public int getCost() {
        return 30;
    }

    @Override
    public String toString() {
        return "Гвоздика (хранение: " + SHELF_LIFE + super.toString();
    }

    public static int getCarnationCounter() {
        return carnationCounter;
    }
}
