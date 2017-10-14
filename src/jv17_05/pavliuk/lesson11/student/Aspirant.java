package jv17_05.pavliuk.lesson11.student;

public class Aspirant extends Student {
    private String scienseWork;

    public Aspirant(String firstName, String lastName, String group, String scienseWork) {
        super(firstName, lastName, group);
        this.scienseWork = scienseWork;

    }

    public int getScholarship(){
        return 200;
    }

    public String getScienseWork() {
        return scienseWork;
    }

    public void setScienseWork(String scienseWork) {
        this.scienseWork = scienseWork;
    }
}
