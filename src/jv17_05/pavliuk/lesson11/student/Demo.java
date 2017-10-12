package jv17_05.pavliuk.lesson11.student;

/**
 * Created by Student on 11.10.2017.
 */
public class Demo {
    public static void main(String[] args) {
        Student student = new Student("Петя","Иванов","ТСМ-06");
        Aspirant aspirant = new Aspirant("Вася","Петров","ТСМ-06","Java Core");
        Student aspirant2 = new Aspirant("Коля","Сидоров","ТСМ-06","Java Core");

        System.out.println(student);
        System.out.println(aspirant);
        System.out.println(aspirant2);

        Student[] students = {student,aspirant,aspirant2};
        for(Student current:students){
            System.out.println(current.getScholarship());
        }
    }

}