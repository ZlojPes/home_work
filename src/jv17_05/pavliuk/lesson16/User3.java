package jv17_05.pavliuk.lesson16;

/**
 * Created by Student on 01.11.2017.
 */
public class User3 {

    private static String login, password;

    public User3(String login, String password) {
        this.login = login;
        this.password = password;
    }

    static class Query {
        public void printToLog() {
            System.out.println("query from user '" + login + "' with password '" + password + "' has been received");
        }
    }

    public void createQuery() {
        new Query().printToLog();
    }

    public static void main(String[] args) {
        User3 user = new User3("Kolya", "123456");
        user.createQuery();
        new User3.Query().printToLog();
    }
}
