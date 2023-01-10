package exception_handling;

public class MyException extends Exception {

    String message;

    public MyException() {
    }

    public MyException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message + " -> " + super.getMessage();
    }
}
