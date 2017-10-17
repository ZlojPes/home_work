package jv17_05.pavliuk.lesson12.access;

import jv17_05.pavliuk.lesson12.access.targetPackage.Target;

public class NotInheritorOutOfPackage {
    public static void main(String[] args) {
        Target target = new Target();
//      target.privateAccess();   //access denied
//      target.packageAccess();   //access denied
//      target.protectedAccess(); //access denied
        target.publicAccess();    //access allowed
    }
}
