package jv17_05.pavliuk.lesson11.flower;

public class Chamomile extends Flower {
    public static final int SHELF_LIFE = 2;
    private static int chamomileCounter;

    public Chamomile(String countryOfOrigin) {
        super(countryOfOrigin);
        chamomileCounter++;
    }

    @Override
    public int getCost() {
        return 15;
    }

    @Override
    public String toString() {
        return "Ромашка (хранение: " + SHELF_LIFE + super.toString();
    }

    public static int getChamomileCounter() {
        return chamomileCounter;
    }
}
