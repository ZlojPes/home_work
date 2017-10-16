package jv17_05.pavliuk.lesson12.access.targetPackage;

public class InheritorSamePackage {
    public static void main(String[] args) {
        Target target = new Target();
//      target.privateAccess(); //access denied
        target.packageAccess();   //access allowed
        target.protectedAccess(); //access allowed
        target.publicAccess();    //access allowed
    }
}
