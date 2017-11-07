package jv17_05.pavliuk.lesson11.access.targetPackage;

public class NotInheritorSamePackage {
    public static void main(String[] args) {
        Target target = new Target();
//      target.privateAccess();  //access denied
        target.packageAccess();  //access allowed
        target.protectedAccess();//access allowed
        target.publicAccess();   //access allowed
    }
}
