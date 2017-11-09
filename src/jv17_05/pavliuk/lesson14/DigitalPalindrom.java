package jv17_05.pavliuk.lesson14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DigitalPalindrom {
    public static void main(String[] args) {
        System.out.println(find("Если есть хвосты по дз, начните с первого несданного задания. 123 324 111 4554"));
    }

    private static String find(String input) {
        String word;
        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(input);
        while (m.find()) {
            word = m.group();
            String reverseWord = new StringBuilder(m.group()).reverse().toString();
            if (reverseWord.equals(word)) {
                return word;
            }
        }
        return "There's no digital palindrome";
    }
}
