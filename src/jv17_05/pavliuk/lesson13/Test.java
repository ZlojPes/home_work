package jv17_05.pavliuk.lesson13;

import java.net.Socket;

public class Test {
    public static void main(String[] args) {
        Seasons summer = Seasons.SUMMER;
        System.out.println(summer);
        printSeason(Seasons.SPRING);
        printAllSeasons();
        favoriteSeason("SUMMER");
    }

    public static void printSeason(Seasons season) {
        switch (season) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
        }
    }

    public static void printAllSeasons(){
        System.out.println("All seasons:");
        Seasons[] seasons = Seasons.values();
        for (Seasons s:seasons){
            System.out.println(s);
        }
    }

    public static void favoriteSeason(String season){
        if(Seasons.SUMMER==Seasons.valueOf(season)){
            System.out.println("My favorite season is "+season);
        }
    }
}
