package jv17_05.pavliuk.lesson19;

import java.io.*;

public class FileInputOutputStreamDemo {
    public static void main(String args[]) {
        File file = new File("src\\jv17_05\\pavliuk\\lesson19\\a.txt");
        try (OutputStream output = new FileOutputStream(file);
             InputStream input = new FileInputStream(file)) {
            char c[] = {'a', 'b', 'c'};
            for (char ch : c) {
                output.write(ch); // Запись каждого символа в текстовый файл
            }

            int size = input.available();

            for (int j = 0; j < size; j++) {
                System.out.print((char) input.read() + " "); // Чтение текстового файла посимвольно
            }
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}
