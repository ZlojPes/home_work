package jv17_05.pavliuk.lesson13;

public class ILikeJava {
    public static void main(String[] args) {
        test("I like Java!!!");
    }

    public static void test(String str) {
        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I li"));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.replace('a', 'o'));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(7, 11));
    }
}
