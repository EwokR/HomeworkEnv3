import java.io.IOException;

public class WrongPasswordException4 extends IOException {
    public WrongPasswordException4() {
        super();
    }

    public WrongPasswordException4(String message) {
        super(message);
    }

    public WrongPasswordException4(String message, Throwable t) {
        super(message, t);
    }

    public WrongPasswordException4(Throwable t) {
        super(t);
    }
}