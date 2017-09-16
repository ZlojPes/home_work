package jv17_05.pavliuk.lesson5;

public class FactorialCounter {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 20);
        long factorial = 1;
        for (int i = 1; i <= random; i++) {
            factorial *= i;
        }
        System.out.print("Факториал числа " + random + " равен " + factorial);
    }
}
