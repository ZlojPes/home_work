package jv17_05.pavliuk.lesson4;

public class IfNotParity {
    public static void main(String[] args) {
        try {
            int input = Integer.parseInt(args[0]);
            if (input % 2 != 0) {
                System.out.println(input);
            }
        } catch (Exception e) {
            System.out.println("Аргумент некорректен либо остутствует.");
        }
    }
}
