package jv17_05.pavliuk.lesson18;

public class WrongLoginException extends Exception {
    public WrongLoginException() {
    }

    public WrongLoginException(String s) {
        super(s);
    }
}
