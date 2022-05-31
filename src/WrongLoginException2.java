import java.io.IOException;

public class WrongLoginException2 extends IOException {
    public WrongLoginException2() {
        super();
    }

    public WrongLoginException2(String message) {
        super(message);
    }

    public WrongLoginException2(String message, Throwable t) {
        super(message,t);
    }

    public WrongLoginException2(Throwable t) {
        super(t);
    }
}
