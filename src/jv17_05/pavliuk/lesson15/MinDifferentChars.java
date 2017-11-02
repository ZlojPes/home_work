package jv17_05.pavliuk.lesson15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MinDifferentChars {
    public static void main(String[] args) {
        System.out.println(find("Найти слово, в котором число различных символов минимально."));
    }

    public static String find(String input) {
        String out = "";
        String[] words = input.split(" ");
        Pattern p = Pattern.compile("[a-z0-9а-я]");
        for (String word : words) {
            int charCounter = 0;
            Matcher m = p.matcher(word);
            while (m.find()) {
                charCounter++;
            }
            if (charCounter < out.length() || out.equals("")) {
                out = word;
            }
        }
        return out;
    }
}
