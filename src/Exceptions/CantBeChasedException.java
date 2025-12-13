package Exceptions;

public class CantBeChasedException extends Exception {
    public CantBeChasedException() {
        super();
    }

    @Override
    public String getMessage() {
        return "This entity can't be chased";
    }
}
