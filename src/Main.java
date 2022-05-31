public class Main {
    public static void main(String[] args) {
        checker("kolbaser", "колбасёр!", "12345678903");
    }

    public static boolean checker(String login, String password, String confirmPassword) {
        int counter = 0;
        try {
            check(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println("Login is too long, please try to use shorter login.");
            counter = counter + 1;
        } catch (WrongLoginException2 e) {
            System.out.println("Login contains non latin letters, please try to use latin letters.");
            counter = counter + 1;
        } catch (WrongLoginException3 e) {
            System.out.println("Login contains forbidden symbols.");
            counter = counter + 1;
        } catch (WrongPasswordException e) {
            System.out.println("Passwords do not match!");
            counter = counter + 1;
        } catch (WrongPasswordException2 e) {
            System.out.println("Passwords contains non latin letters, please try to use latin letters.");
            counter = counter + 1;
        } catch (WrongPasswordException3 e) {
            System.out.println("Passwords contains forbidden symbols");
            counter = counter + 1;
        } catch (WrongPasswordException4 e) {
            System.out.println("Passwords is too long, please try to use shorter password.");
            counter = counter + 1;
        }
        if (counter < 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void check(String login, String password, String confirmPassword) throws WrongPasswordException, WrongPasswordException2, WrongPasswordException3, WrongPasswordException4, WrongLoginException, WrongLoginException2, WrongLoginException3 {
        if (password != confirmPassword) {
            throw new WrongPasswordException();
        }
        if (login.matches("[а-яА-Я]+")) {
            throw new WrongLoginException2();
        }
        if (password.matches("[а-яА-Я]+")) {
            throw new WrongPasswordException2();
        }
        if (password.contains("-* +=)(&?//,.!@#№%^:;$")) {
            throw new WrongPasswordException3();
        }
        if (password.length() >= 20) {
            throw new WrongPasswordException4();
        }
        if (login.length() > 20) {
            throw new WrongLoginException();
        }
        if (login.contains("-* +=)(&?//,.!@#№%^:;$")) {
            throw new WrongLoginException3();
        }
    }
}
