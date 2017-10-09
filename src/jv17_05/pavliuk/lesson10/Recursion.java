package jv17_05.pavliuk.lesson10;

public class Recursion {
    int start, end;

    public Recursion(int start, int end) {
        this.start = start;
        this.end = end;
    }

    void print(int current) {
        System.out.println(current);
        if (current++ < end) {
            print(current);
        }
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public static void main(String[] args) {
        Recursion test = new Recursion(5, 10);
        test.print(test.getStart());
    }
}
