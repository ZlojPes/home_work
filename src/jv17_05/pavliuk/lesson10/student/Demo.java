package jv17_05.pavliuk.lesson10.student;

public class Demo {
    public static void main(String[] args) {
        Student student = new Student("Петя", "Иванов", "ТСМ-06");
        Aspirant aspirant = new Aspirant("Вася", "Петров", "ТСМ-06", "Java Core");
        Student aspirant2 = new Aspirant("Коля", "Сидоров", "ТСМ-06", "Java Core");
        System.out.println(student);
        System.out.println(aspirant);
        System.out.println(aspirant2);
        Student[] students = {student, aspirant, aspirant2};
        for (Student current : students) {
            System.out.println(current.getScholarship());
        }
    }
}
