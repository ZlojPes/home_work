package jv17_05.pavliuk.lesson15.employee;

public class Report {
    private Report() {
    }

    public static void generateReport(Employee[] employees) {
        int count = 0, nameMaxLength = 0;
        float totalSalary = 0;
        for (Employee emp : employees) {
            int l = emp.getFullName().length();
            if (l > nameMaxLength) {
                nameMaxLength = l;
            }
        }
        System.out.printf("%-" + (nameMaxLength + 6) + "s%s%n", "n/n Employee", "Salary"); //Header
        for (Employee emp : employees) {
            count++;
            System.out.printf(" %-3d%-" + nameMaxLength + "s  %.2f$%n", count, emp.getFullName(), emp.getSalary());
            totalSalary += emp.getSalary();
        }
        System.out.printf("%" + (nameMaxLength + 6) + "s%.2f$", "Total: ", totalSalary);  //Total string
    }
}
