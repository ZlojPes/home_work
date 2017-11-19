package jv17_05.pavliuk.lesson18;

import java.io.*;

public class FileCopy {
    public static void main(String args[]) throws IOException {

        try (FileInputStream fileIn = new FileInputStream("src\\io\\file.txt");
             FileOutputStream fileOut = new FileOutputStream("src\\io\\copied_file.txt")) {
            int a;
            while ((a = fileIn.read()) != -1) {
                fileOut.write(a); // Чтение содержимого файла file.txt и запись в файл copied_file.txt
            }
        }
    }
}
