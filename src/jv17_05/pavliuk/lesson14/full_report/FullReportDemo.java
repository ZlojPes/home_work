package jv17_05.pavliuk.lesson14.full_report;

import jv17_05.pavliuk.lesson13.employee.Employee;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Locale;

public class FullReportDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Employee e1 = new Employee("Ivanov Petr", getSalary(), new Date(1510044953673L));
        Employee e2 = new Employee("Smirnova Marina", getSalary(), new Date(1510046953673L));
        Employee e3 = new Employee("Sidorov Alexey", getSalary(), new Date(1510047953673L));
        Employee e4 = new Employee("Petrov Ivan", getSalary(), new Date(1510045953673L));
        Employee[] array = {e1, e2, e3, e4};
        FullReport.generateReport(array, new Locale("", ""));
        System.out.println();
        FullReport.generateReport(array, new Locale("ru", "RU"));
    }

    private static float getSalary() {
        return (float) (Math.random() * 2000 + 1000);
    }
}
