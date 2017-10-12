package jv17_05.pavliuk.lesson11.flower;

public abstract class Flower {
    protected String countryOfOrigin;
    protected static int overallCounter;

    public static int getOverallCounter() {
        return overallCounter;
    }

    public Flower(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public abstract int getCost();

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }
}
