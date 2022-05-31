import java.io.IOException;

public class WrongPasswordException3 extends IOException {
    public WrongPasswordException3() {
        super();
    }

    public WrongPasswordException3(String message) {
        super(message);
    }

    public WrongPasswordException3(String message, Throwable t) {
        super(message, t);
    }

    public WrongPasswordException3(Throwable t) {
        super(t);
    }
}