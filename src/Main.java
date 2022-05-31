public class Main {
    public static void main(String[] args) {
        checker("kolbaser", "kolbaser", "12345678903");
    }

    public static boolean checker(String login, String password, String confirmPassword) {
        int counter = 0;
        try {
            check(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println("Login is too long, please try to use shorter login.");
            return false;
        } catch (WrongLoginException2 e) {
            System.out.println("Login contains non latin letters, please try to use latin letters.");
            return false;
        } catch (WrongLoginException3 e) {
            System.out.println("Login contains forbidden symbols.");
            return false;
        } catch (WrongPasswordException e) {
            System.out.println("Passwords do not match!");
            return false;
        } catch (WrongPasswordException2 e) {
            System.out.println("Passwords contains non latin letters, please try to use latin letters.");
            return false;
        } catch (WrongPasswordException3 e) {
            System.out.println("Passwords contains forbidden symbols");
            return false;
        } catch (WrongPasswordException4 e) {
            System.out.println("Passwords is too long, please try to use shorter password.");
            return false;
        }
            return true;
        }

    public static void check(String login, String password, String confirmPassword) throws WrongPasswordException, WrongPasswordException2, WrongPasswordException3, WrongPasswordException4, WrongLoginException, WrongLoginException2, WrongLoginException3 {
        if (!password.equals(confirmPassword) ) {
            throw new WrongPasswordException();
        }
        if (login.matches("[а-яА-Я]+")) {
            throw new WrongLoginException2();
        }
        if (password.matches("[а-яА-Я]+")) {
            throw new WrongPasswordException2();
        }
        if (password.matches("[Pc[^_]]")) {
            throw new WrongPasswordException3();
        }
        if (password.length() >= 20) {
            throw new WrongPasswordException4();
        }
        if (login.length() > 20) {
            throw new WrongLoginException();
        }
        if (login.matches("[Pc[^_]]")) {
            throw new WrongLoginException3();
        }
    }
}
