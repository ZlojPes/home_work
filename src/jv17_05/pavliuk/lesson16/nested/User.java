package jv17_05.pavliuk.lesson16.nested;

public class User {
    private String login, password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    class Query {
        public void printToLog() {
            System.out.println("query from user '" + login + "' with password '" + password + "' has been received");
        }
    }

    public void createQuery() {
        new Query().printToLog();
    }

    public static void main(String[] args) {
        User user = new User("Kolya", "123456");
        user.createQuery();
        new User("Petya", "password").new Query().printToLog();
    }
}
