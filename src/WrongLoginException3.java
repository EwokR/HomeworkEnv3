import java.io.IOException;

public class WrongLoginException3 extends IOException {
    public WrongLoginException3() {
        super();
    }

    public WrongLoginException3(String message) {
        super(message);
    }

    public WrongLoginException3(String message, Throwable t) {
        super(message,t);
    }

    public WrongLoginException3(Throwable t) {
        super(t);
    }
}