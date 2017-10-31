package jv17_05.pavliuk.lesson15.employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ivanov Petr", getSalary());
        Employee e2 = new Employee("Smirnova Marina", getSalary());
        Employee e3 = new Employee("Sidorov Alexey", getSalary());
        Employee e4 = new Employee("Petrov Ivan", getSalary());
        Employee[] array = {e1, e2, e3, e4};
        Report.generateReport(array);
    }

    private static float getSalary() {
        return (float) (Math.random() * 2000 + 1000);
    }
}
