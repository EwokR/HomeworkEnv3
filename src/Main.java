public class Main {
    public static void main(String[] args) {
        boolean result = checker("kolbaser_", "kolbaser", "kolbaser");
        if (result = true) {
            System.out.println("All correct.");
        } else {
            System.out.println("Something wrong.");
        }

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

    public static void check(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException {
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
        if (!login.matches("[A-z0-9_]+")) {
            throw new WrongLoginException();
        }
        if (!password.matches("[A-z0-9_]+")) {
            throw new WrongPasswordException();
        }
        if (password.length() >= 20) {
            throw new WrongPasswordException();
        }
        if (login.length() > 20) {
            throw new WrongLoginException();
        }
    }
}
