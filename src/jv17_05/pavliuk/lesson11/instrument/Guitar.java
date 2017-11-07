package jv17_05.pavliuk.lesson11.instrument;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Guitar guitar = (Guitar) o;

        return stringsNumber == guitar.stringsNumber;
    }

    @Override
    public int hashCode() {
        return stringsNumber;
    }
}
