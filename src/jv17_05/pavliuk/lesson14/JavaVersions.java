package jv17_05.pavliuk.lesson14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by student on 10/29/2017.
 */
public class JavaVersions {
    public static void main(String[] args) {
        String text = "Versions: Java 5, Java 6, Java  7, Java 8.";
        Pattern pattern = Pattern.compile("Java\\s+\\d");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
