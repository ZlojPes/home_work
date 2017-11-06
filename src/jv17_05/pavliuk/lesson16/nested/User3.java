package jv17_05.pavliuk.lesson16.nested;

public class User3 {

    private static String login = "User", password = "test1234";

    static class Query {
        public void printToLog() {
            System.out.println("query from user '" + login + "' with password '" + password + "' has been received");
        }
    }

    public void createQuery() {
        new Query().printToLog();
    }

    public static void main(String[] args) {
        new User3.Query().printToLog();
    }
}
