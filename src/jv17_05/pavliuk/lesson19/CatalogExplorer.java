package jv17_05.pavliuk.lesson19;

import java.io.File;

public class CatalogExplorer {
    public static void main(String[] args) {
        printContent("src");
    }

    public static void printContent(String path) {
        System.out.print("Содержимое каталога ");
        printContent(new File(path), 0);
    }

    private static void printContent(File file, int level) {
        String path = file.getName();
        System.out.printf("%" + (path.length() + level) + "s%n", path);
        if (file.isDirectory()) {
            for (File f : file.listFiles()) {
                printContent(f, level + 2);
            }
        }
    }
}
