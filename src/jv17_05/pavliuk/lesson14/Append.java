package jv17_05.pavliuk.lesson14;

public class Append {
    public static void main(String[] args) {
        append(3, 56);
    }

    public static void append(int i, int j) {
        StringBuilder sb = new StringBuilder();
        sb.append(i).append(" + ").append(j).append(" = ").append(i + j);
        System.out.println(sb);
        sb = new StringBuilder();
        sb.append(i).append(" - ").append(j).append(" = ").append(i - j);
        System.out.println(sb);
        sb = new StringBuilder();
        sb.append(i).append(" * ").append(j).append(" = ").append(i * j);
        System.out.println(sb);
        int start = sb.indexOf("=");
        sb.replace(start, start + 1, "равно");
        System.out.println(sb);
    }
}
