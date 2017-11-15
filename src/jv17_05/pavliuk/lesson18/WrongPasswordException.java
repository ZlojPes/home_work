package jv17_05.pavliuk.lesson18;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
    }

    public WrongPasswordException(String s) {
        super(s);
    }
}
