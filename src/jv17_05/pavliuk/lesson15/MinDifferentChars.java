package jv17_05.pavliuk.lesson15;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MinDifferentChars {
    public static void main(String[] args) {
        System.out.println(find("Найти слово, в котором число различных символов минимально."));
    }

    public static String find(String input) {
        String out = "";
        int outUniqueDigits = 0;
        Pattern p = Pattern.compile("[a-zA-Z0-9а-яА-Я]+");
        Matcher m = p.matcher(input);
        while (m.find()) {
            String word = m.group();
            StringBuilder sb = new StringBuilder(word);
            for (int i = 0; i < sb.length(); i++) {
                String a = String.valueOf(sb.charAt(i));
                int duplicateCharPosition;
                while ((duplicateCharPosition = sb.indexOf(String.valueOf(sb.charAt(i)), (i + 1))) > i) {
                    sb.deleteCharAt(duplicateCharPosition);
                }
            }
            if (sb.length() < outUniqueDigits || out.equals("")) {
                out = word;
                outUniqueDigits = sb.length();
            }
        }
        return out;
    }
}
