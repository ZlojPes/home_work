package jv17_05.pavliuk.lesson15.employee;

import java.util.Locale;
import java.util.ResourceBundle;

public class FullReport {
    private static final int SHIFT = 6;

    private FullReport() {
    }

    public static void generateReport(Employee[] employees, Locale locale) {
        ResourceBundle rb = ResourceBundle.getBundle("report", locale);
        int count = 0, nameMaxLength = 0;
        float totalSalary = 0;
        for (Employee emp : employees) {
            int l = emp.getFullName().length();
            if (l > nameMaxLength) {
                nameMaxLength = l;
            }
        }
        System.out.printf("%-" + (nameMaxLength + SHIFT) + "s%s%n", rb.getString("part1"), rb.getString("part2")); //Header
        for (Employee emp : employees) {
            count++;
            System.out.printf(" %-3d%-" + nameMaxLength + "s  %.2f$%n", count, emp.getFullName(), emp.getSalary());
            totalSalary += emp.getSalary();
        }
        System.out.printf("%" + (nameMaxLength + SHIFT) + "s%.2f$", rb.getString("part3"), totalSalary);  //Total string
    }
}
