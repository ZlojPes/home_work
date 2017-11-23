package jv17_05.pavliuk.lesson19.serialization;

import java.io.*;

public class SerDemo {
    private static String path = "src\\jv17_05\\pavliuk\\lesson19\\serialization\\horse.ser";

    public static void main(String[] args) {
        Horse horse = new Horse(new Halter(9));
        serialize(horse);
        Horse anotherHorse = deSerHorse();
        System.out.println(anotherHorse.halter.getSize());
    }

    private static Horse deSerHorse() {
        Horse outHorse = null;
        try (FileInputStream fis = new FileInputStream(path)) {
            ObjectInputStream ois = new ObjectInputStream(fis);
            outHorse = (Horse) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return outHorse;
    }

    private static void serialize(Horse horse) {
        try (FileOutputStream fs = new FileOutputStream(path)) {
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(horse);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
