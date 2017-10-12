package jv17_05.pavliuk.lesson11.flower;

public class Chamomile extends Flower {
    public static final int SHELF_LIFE = 2;
    private static int chamomileCounter;

    public Chamomile(String countryOfOrigin) {
        super(countryOfOrigin);
        overallCounter++;
        chamomileCounter++;
    }

    @Override
    public int getCost() {
        return 15;
    }

    public static int getChamomileCounter() {
        return chamomileCounter;
    }
}
