package jv17_05.pavliuk.lesson12.instrument;

public class Guitar implements Instrument {
    private int stringsNumber;

    public Guitar(int stringsNumber) {
        this.stringsNumber = stringsNumber;
    }

    public int getStringsNumber() {
        return stringsNumber;
    }

    public void setStringsNumber(int stringsNumber) {
        this.stringsNumber = stringsNumber;
    }

    @Override
    public void play() {
        System.out.println(" играет ноту " + KEY);
    }

    @Override
    public String toString() {
        return "гитара с " + stringsNumber +
                " струнами";
    }
}
