package exceptions;

public class InvalidNumberException extends Exception {
    public InvalidNumberException(String m) {
        super("number should be between " + m);
    }
}
