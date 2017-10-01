package jv17_05.pavliuk.lesson7;

public class Phone {
    private long number;
    private int weight;
    private String model;

    public Phone() {
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

    public long getNumber() {
        return number;
    }

    public int getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Модель телефона: " + model + "\nНомер:" + number + "\nВес: " + weight + "г.";
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone(380971234567L, 93, "Nokia 1100");
        Phone phone2 = new Phone(380577231598L, 1087, "VEF-72 (дисковый)");
        Phone phone3 = new Phone(380990516273L, 174, "Apple IPhone X");
        System.out.println(phone1 + "\n");
        System.out.println(phone2 + "\n");
        System.out.println(phone3);

        phone1.receiveCall("Петя", 380571234567L);
    }
}
