package jv17_05.pavliuk.lesson15.employee;

import java.util.Date;

public class Employee {
    private String fullName;
    private float salary;
    private Date date;

    public Employee(String fullName, float salary, Date date) {
        this.fullName = fullName;
        this.salary = salary;
        this.date = date;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Employee: %s age: %d", fullName, salary);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (Float.compare(employee.salary, salary) != 0) return false;
        return fullName != null ? fullName.equals(employee.fullName) : employee.fullName == null;
    }

    @Override
    public int hashCode() {
        int result = fullName != null ? fullName.hashCode() : 0;
        result = 31 * result + (salary != +0.0f ? Float.floatToIntBits(salary) : 0);
        return result;
    }
}
