package jv17_05.pavliuk.lesson17;

import java.util.*;

public class Student {
    private String name, group;
    private int course;
    private int[] marks;

    public Student(String name, int course, String group, int... marks) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public double getAverageMark() {
        int sum = 0;
        for (int i : marks) {
            sum += i;
        }
        return sum / marks.length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (course != student.course) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        if (group != null ? !group.equals(student.group) : student.group != null) return false;
        return marks != null ? marks.equals(student.marks) : student.marks == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (group != null ? group.hashCode() : 0);
        result = 31 * result + course;
        result = 31 * result + (marks != null ? marks.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Студент {" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Петров", 2, "ART5", 2, 3, 4, 5, 3, 2),
                new Student("Иванов", 4, "Tech2", 4, 3, 2, 5, 3, 2, 4),
                new Student("Сидоров", 3, "Hum3", 2, 3, 4, 2, 2, 2, 3, 2),
                new Student("Пупкин", 2, "Hum3", 2, 3, 4, 5, 4, 3, 2, 2, 2, 2),
                new Student("Nguen", 1, "Hum3", 3, 4, 5, 3, 4, 5, 4, 3, 2, 3, 5)
        ));
        Iterator<Student> iterator = students.listIterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getAverageMark() < 3) {
                System.out.println("Студент " + s.getName() + " отчисляется за неуспеваемость");
                iterator.remove();
            } else {
                System.out.println("Студент " + s.getName() + " переводится на следующий курс");
                s.setCourse(s.getCourse() + 1);
            }
        }
        printStudents(students, 3);
    }

    private static void printStudents(List<Student> students, int course) {
        Iterator<Student> iterator = students.listIterator();
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getCourse() == course) {
                System.out.println(s);
            }
        }
    }
}
