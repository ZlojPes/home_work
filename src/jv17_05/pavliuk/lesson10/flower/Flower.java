package jv17_05.pavliuk.lesson10.flower;

public abstract class Flower {
    protected String countryOfOrigin;
    protected static int overallCounter;

    public Flower(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
        overallCounter++;
    }

    public abstract int getCost();

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public static int getOverallCounter() {
        return overallCounter;
    }

    @Override
    public String toString() {
        return " дней; страна: " + countryOfOrigin + "; цена: " + getCost() + " грн.)";
    }
}
