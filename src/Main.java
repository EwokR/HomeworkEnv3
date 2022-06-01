public class Main {
    public static void main(String[] args) {
        checker("kolbaser", "kolbaser", "12345678903");
    }

    public static boolean checker(String login, String password, String confirmPassword) {
        try {
            check(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println("Login is too long, or contains forbidden symbols.");
            return false;
        } catch (WrongPasswordException e) {
            System.out.println("Passwords do not match or contains forbidden symbols.");
            return false;
        }
            return true;
        }

    public static void check(String login, String password, String confirmPassword) throws WrongPasswordException,  WrongLoginException {
        if (!password.equals(confirmPassword) ) {
            throw new WrongPasswordException();
        }
        if (login.matches("[а-яА-Я]+")) {
            throw new WrongLoginException();
        }
        if (password.matches("[а-яА-Я]+")) {
            throw new WrongPasswordException();
        }
        if (password.matches("[Pc[^_]]")) {
            throw new WrongPasswordException();
        }
        if (password.length() >= 20) {
            throw new WrongPasswordException();
        }
        if (login.length() > 20) {
            throw new WrongLoginException();
        }
        if (login.matches("[Pc[^_]]")) {
            throw new WrongLoginException();
        }
    }
}
