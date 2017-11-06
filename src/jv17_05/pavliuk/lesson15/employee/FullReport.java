package jv17_05.pavliuk.lesson15.employee;

import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class FullReport {
    private static final int SHIFT = 6;

    private FullReport() {
    }

    public static void generateReport(Employee[] employees, Locale locale) throws UnsupportedEncodingException {
        ResourceBundle rb = ResourceBundle.getBundle("report", locale);
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        int count = 0, nameMaxLength = 0;
        float totalSalary = 0;
        for (Employee emp : employees) {
            int l = emp.getFullName().length();
            if (l > nameMaxLength) {
                nameMaxLength = l;
            }
        }
        String s1 = new String(rb.getString("part1").getBytes("ISO-8859-1"), "UTF-8");
        String s2 = new String(rb.getString("part2").getBytes("ISO-8859-1"), "UTF-8");
        String s3 = new String(rb.getString("part3").getBytes("ISO-8859-1"), "UTF-8");
        String s4 = new String(rb.getString("part4").getBytes("ISO-8859-1"), "UTF-8");
        System.out.printf("%-" + (nameMaxLength + SHIFT) + "s%-10s%s%n", s1, s2, s4); //Header
        for (Employee emp : employees) {
            count++;
            System.out.printf(" %-3d%-" + nameMaxLength + "s  %.2f$%10s%n", count, emp.getFullName(), emp.getSalary(), df.format(emp.getDate()));
            totalSalary += emp.getSalary();
        }
        System.out.printf("%" + (nameMaxLength + SHIFT) + "s%.2f$%n", s3, totalSalary);  //Total string
    }
}
