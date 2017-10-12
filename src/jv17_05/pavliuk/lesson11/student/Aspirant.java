package jv17_05.pavliuk.lesson11.student;

/**
 * Created by Student on 11.10.2017.
 */
public class Aspirant extends Student {
    private String scienseWork;

    public Aspirant(String firstName, String lastName, String group, String scienseWork) {
        super(firstName, lastName, group);
        this.scienseWork = scienseWork;
    }

    public int getScholarship(){
        return 200;
    }
}
