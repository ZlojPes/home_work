package jv17_05.pavliuk.lesson4;

public class Garland {
    private static int garland = -2004318072;

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(garland));
        blink(9);
        System.out.println(Integer.toBinaryString(garland));
        moveLeft(11);
        System.out.println(Integer.toBinaryString(garland));
    }

    static void blink(int count) {
        for (int i = 0; i < count; i++) {
            garland = ~garland;
        }
    }

    static void moveLeft(int numberOfMoves) {
        for (int i = 0; i < numberOfMoves; i++) {
            garland <<= 1;
        }
    }
}
