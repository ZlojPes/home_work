package jv17_05.pavliuk.lesson6;

public class Array3x6 {
    public static void main(String[] args) {
        String[][] ar = new String[3][6];
        char ch = 'a';
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                ar[i][j] = "" + ch + (j + 1);
            }
            ch++;
        }

        for (String[] s : ar) {
            for (String p : s) {
                System.out.print(p + " ");
            }
            System.out.println();
        }
    }
}
