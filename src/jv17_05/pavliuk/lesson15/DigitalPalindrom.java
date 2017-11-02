package jv17_05.pavliuk.lesson15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DigitalPalindrom {
    public static void main(String[] args) {
        System.out.println(find("Если есть хвосты по дз, начните с первого несданного задания. 123 324 111 4554"));
    }

    private static String find(String input) {
        String buffer;
        Pattern p = Pattern.compile("[0-9]+");
        Matcher m = p.matcher(input);
        while (m.find()) {
            buffer = m.group();
            StringBuilder sb = new StringBuilder(m.group()).reverse();
            if (new StringBuilder(m.group()).reverse().toString().equals(buffer)) {
                return buffer;
            }
        }
        return "There's no digital palindrome";
    }
}
