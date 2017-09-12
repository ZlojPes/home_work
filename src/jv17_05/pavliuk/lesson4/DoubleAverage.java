package jv17_05.pavliuk.lesson4;

public class DoubleAverage {
    public static void main(String[] args) {
        double sum = 0;
        for (String c : args) {
            sum += Double.parseDouble(c);
        }
        double result = args.length != 0 ? sum / args.length : 0;
        System.out.println("Среднее арифметическое значение от переданных аргументов = " + result);
    }
}
