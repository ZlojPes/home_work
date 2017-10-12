package jv17_05.pavliuk.lesson11.student;

/**
 * Created by Student on 11.10.2017.
 */
public class Student {
    public String firstName, lastName, group;

    public Student(String firstName, String lastName, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
    }

    public int getScholarship(){
        return 100;
    }

    public String toString(){
        return firstName+" "+lastName+" Группа: "+group;
    }
}
