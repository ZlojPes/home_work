package jv17_05.pavliuk.lesson10;

public class Recursion {
    private int start, end;

    public Recursion(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void print(int current) {
        System.out.println(current);
        if (current++ < end) {
            print(current);
        }
    }

    public int getStart() {
        return start;
    }

    public static void main(String[] args) {
        Recursion test = new Recursion(5, 10);
        test.print(test.getStart());
    }
}
