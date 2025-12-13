package Exceptions;

public class SckrepyMissmatchException extends RuntimeException{
    public SckrepyMissmatchException() {
        super();
    }

    @Override
    public String getMessage() {
        return "This sex isn't supported in this region";
    }
}
