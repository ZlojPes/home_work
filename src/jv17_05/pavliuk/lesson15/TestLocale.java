package jv17_05.pavliuk.lesson15;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class TestLocale {
    public static void main(String[] args) throws UnsupportedEncodingException {
        printInfo("", "");
        printInfo("ru", "RU");
    }

    private static void printInfo(String language, String country) throws UnsupportedEncodingException {
        Locale locale = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("text", locale);
        String s1 = rb.getString("task1");
        s1 = new String(s1.getBytes("ISO-8859-1"), "UTF-8");
        System.out.println(s1);

        String s2 = rb.getString("task2");
        s2 = new String(s2.getBytes("ISO-8859-1"), "UTF-8");
        System.out.println(s2);

        String s3 = rb.getString("task3");
        s3 = new String(s3.getBytes("ISO-8859-1"), "UTF-8");
        System.out.println(s3);
        System.out.println();
    }
}
