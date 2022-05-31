import java.io.IOException;

public class WrongPasswordException2 extends IOException {
    public WrongPasswordException2() {
        super();
    }

    public WrongPasswordException2(String message) {
        super(message);
    }

    public WrongPasswordException2(String message, Throwable t) {
        super(message, t);
    }

    public WrongPasswordException2(Throwable t) {
        super(t);
    }
}