package jv17_05.pavliuk.lesson15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LatinCharsOnly {
    public static void main(String[] args) {
        System.out.println(find("Найти количество words, which contain только symbols латинского алфавита."));
    }

    private static int find(String input) {
        int wordsFound = 0;
        Pattern p = Pattern.compile("[a-zA-Z]+");
        Matcher m = p.matcher(input);
        while (m.find()) {
            wordsFound++;
        }
        return wordsFound;
    }
}
