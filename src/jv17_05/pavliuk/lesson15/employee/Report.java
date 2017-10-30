package jv17_05.pavliuk.lesson15.employee;

public class Report {
    private Report() {
    }

    public static void generateReport(Employee[] employees) {
        int count = 0;
        float totalSalary = 0;
        for (Employee emp : employees) {
            count++;
            System.out.printf("%d). %s has salary %.2f$%n", count, emp.getFullName(), emp.getSalary());
            totalSalary += emp.getSalary();
        }
        System.out.printf("Total salary is: %.2f$",totalSalary);
    }
}
