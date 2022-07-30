package lesson5_exceptions;

public class WrongRangeException extends Exception {
    public WrongRangeException(String message) {
        super(message);
    }
}
