package jv17_05.pavliuk.lesson13;

public class MiddleOfTheString {
    public static void main(String[] args) {
        System.out.println(getMiddleSigns("string"));
        System.out.println(getMiddleSigns("code"));
        System.out.println(getMiddleSigns("Practice"));
    }

    public static String getMiddleSigns(String s) {
        StringBuilder sb = new StringBuilder(s);
        int start = s.length() / 2 - 1;
        return sb.substring(start, start + 2);
    }
}
