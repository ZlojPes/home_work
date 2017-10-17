package jv17_05.pavliuk.lesson12.access.targetPackage;

public class Target {
    private void privateAccess() {
        System.out.println("private access");
    }

    void packageAccess() {
        System.out.println("package access");
    }

    protected void protectedAccess() {
        System.out.println("protected access");
    }

    public void publicAccess() {
        System.out.println("public access");
    }

    public static void main(String[] args) {
        Target target = new Target();
        target.privateAccess();   //access allowed
        target.packageAccess();   //access allowed
        target.protectedAccess(); //access allowed
        target.publicAccess();    //access allowed
    }
}
