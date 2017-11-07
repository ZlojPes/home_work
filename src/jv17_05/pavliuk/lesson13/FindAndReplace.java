package jv17_05.pavliuk.lesson13;

public class FindAndReplace {
    private static String s = "Object-oriented programming is a paradigm based on the concept of \"objects\", which may " +
            "contain data, in the form of fields, often known as attributes; and code, in the form of procedures, often " +
            "known as methods. A feature of objects is that an object's procedures can access and often modify the data" +
            " fields of the object with which they are associated (objects have a notion of \"this\" or \"self\"). In " +
            "object-oriented programming, computer programs are designed by making them out of objects that interact " +
            "with one another. There is significant diversity of object-oriented programming languages, but the most " +
            "popular ones are class-based, meaning that objects are instances of classes, which typically also determine" +
            " their type.";

    public static void main(String[] args) {
        String s1 = findAndReplace(s, "object-oriented programming", "OOP");
        System.out.println(s1);
    }

    public static String findAndReplace(String input, String oldSub, String newSub) {
        StringBuilder out = new StringBuilder(input);
        String lowCase = input.toLowerCase();
        oldSub = oldSub.toLowerCase();
        int start;
        while ((start = lowCase.indexOf(oldSub)) >= 0) {
            out.replace(start, start + oldSub.length(), newSub);
            lowCase = out.toString().toLowerCase();
        }
        return out.toString();
    }
}
