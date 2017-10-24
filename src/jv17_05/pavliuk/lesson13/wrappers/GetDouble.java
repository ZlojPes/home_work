package jv17_05.pavliuk.lesson13.wrappers;

public class GetDouble {
    public static void main(String[] args) {
        Double d1 = Double.valueOf(10.35);
        Double d2 = Double.valueOf("20.55");
        Double d3 = Double.valueOf('a');
        double d4 = Double.parseDouble("3.1415926");
        byte b1 = d1.byteValue();
        short s1 = d1.shortValue();
        int i1 = d1.intValue();
        long l1 = d1.longValue();
        float f1 = d1.floatValue();
        String d = Double.toString(3.14);
        System.out.println(d1);
    }
}
