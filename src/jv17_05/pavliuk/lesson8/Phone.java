package jv17_05.pavliuk.lesson8;

public class Phone {
    private long number;
    private int weight;
    private String model;
    private static int counter;

    public Phone() {
        number = 0;
        weight = 100;
        model = "Default model";
        counter++;
    }

    public Phone(long number, int weight, String model) {
        this();
        this.number = number;
        this.weight = weight;
        this.model = model;
    }

    private void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    private void receiveCall(String callerName, long number) {
        System.out.println("Звонит " + callerName + " {" + number + "}");
    }

    public void sendMessage(long... nums) {
        for (long num : nums) {
            System.out.println("Передача сообщения на номер " + num);
        }
    }

    public long getNumber() {
        return number;
    }

    public int getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }

    public static int getCounter() {
        return counter;
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone(380971234567L, 93, "Nokia 1100");
        Phone phone2 = new Phone(380577231598L, 1087, "VEF-72 (дисковый)");
        Phone phone3 = new Phone(380990516273L, 174, "Apple IPhone X");

        System.out.println(phone1 + "\n");
        System.out.println(phone2 + "\n");
        System.out.println(phone3 + "\n");

        phone1.receiveCall("Катя", 380571234567L);
        phone1.receiveCall("Петя");
        phone2.receiveCall("Коля");
        phone3.receiveCall("Оля");

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());
        phone1.sendMessage(380991234567L, 380579876543L, 380664321765L);
        System.out.println("Кол-во телефонов: " + counter);
    }

    @Override
    public String toString() {
        return "Модель телефона: " + model + "\nНомер:" + number + "\nВес: " + weight + "г.";
    }
}
