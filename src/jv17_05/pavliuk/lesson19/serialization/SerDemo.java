package jv17_05.pavliuk.lesson19.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerDemo {
    public static void main(String[] args) {
        Horse horse = new Horse(new Halter(9));
        serialize(horse);
        Horse anotherHorse = deSerHorse();
        System.out.println(anotherHorse.halter.size);
        ;
    }

    private static Horse deSerHorse() {
        Horse outHorse = null;
        try (FileInputStream fis = new FileInputStream("src\\jv17_05\\pavliuk\\lesson19\\serialization\\horse.ser")) {
            ObjectInputStream ois = new ObjectInputStream(fis);
            outHorse = (Horse) ois.readObject(); // 4
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return outHorse;
    }

    private static void serialize(Horse horse) {
        try (FileOutputStream fs = new FileOutputStream("src\\jv17_05\\pavliuk\\lesson19\\serialization\\horse.ser")) {
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(horse);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
