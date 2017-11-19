package jv17_05.pavliuk.lesson18;

public class Auth {
    public static boolean checkAuth(String login, String password, String confirmPassword) {
        try {
            if (login.length() > 20) {
                throw new WrongLoginException("Login must be less than 20 character!");
            }
            if (password.length() > 20 || !password.equals(confirmPassword)) {
                throw new WrongPasswordException("Passwoord more than 20 character or confirmation not match");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            System.out.println("Login: " + login + "; Password:" + password);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkAuth("WrongLoginTest11111111", "1234", "1234"));
        System.out.println(checkAuth("login", "incorrectPasswordtest", "incorrectPasswordtest"));
        System.out.println(checkAuth("login", "incorrectPasswordtest", "1234"));
        System.out.println(checkAuth("login", "1234", "1234"));

    }
}
