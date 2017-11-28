package jv17_05.pavliuk.lesson19;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        File source = new File("src\\io\\source.txt");
        File dest = new File("src\\io\\dest.txt");
        copy(source, dest);
    }

    private static boolean copy(File source, File dest) {
        try (FileReader reader = new FileReader(source);
             FileWriter writer = new FileWriter(dest);
             BufferedReader bReader = new BufferedReader(reader);
             BufferedWriter bWriter = new BufferedWriter(writer);) {
            String s;
            while ((s = bReader.readLine()) != null) {
                bWriter.write(s);
                bWriter.newLine();
            }
            bWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
}
