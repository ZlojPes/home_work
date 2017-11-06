package jv17_05.pavliuk.lesson16.nested;

public class User2 {
    private String login, password;

    public User2(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void createQuery() {
        class Query {
            public void printToLog() {
                System.out.println("query from user '" + login + "' with password '" + password + "' has been received");
            }
        }
        new Query().printToLog();
    }

    public static void main(String[] args) {
        User2 user = new User2("Sveta", "123456");
        user.createQuery();
    }
}
