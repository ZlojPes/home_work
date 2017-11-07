package jv17_05.pavliuk.lesson12.seasons;

public class Test {
    public static void main(String[] args) {
        Seasons favoriteSeason = Seasons.SUMMER;
        printSeason(Seasons.SPRING);
        printAllSeasons();
        favoriteSeason("SUMMER");
    }

    public static void printSeason(Seasons season) {
        switch (season) {
            case WINTER:
                System.out.println("I like winter");
                break;
            case SPRING:
                System.out.println("I like spring");
                break;
            case SUMMER:
                System.out.println("I like summer");
                break;
            case AUTUMN:
                System.out.println("I like autumn");
        }
    }

    public static void printAllSeasons() {
        System.out.println("\nAll seasons:");
        Seasons[] seasons = Seasons.values();
        for (Seasons s : seasons) {
            System.out.println(s + " " + s.getDescription() + ", it has average temperature " + s.averageTemp + " Celsius");
        }
    }

    public static void favoriteSeason(String season) {
        if (Seasons.SUMMER == Seasons.valueOf(season)) {
            System.out.println("My favorite season is " + season + ". It " + Seasons.SUMMER.getDescription() +
                    " and it has average temperature " + Seasons.SUMMER.averageTemp + " Celsius");
        }
    }
}
