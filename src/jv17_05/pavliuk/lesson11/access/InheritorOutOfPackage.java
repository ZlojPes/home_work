package jv17_05.pavliuk.lesson11.access;

import jv17_05.pavliuk.lesson11.access.targetPackage.Target;

public class InheritorOutOfPackage extends Target {
    public static void main(String[] args) {
        InheritorOutOfPackage inheritor = new InheritorOutOfPackage();
//      inheritor.privateAccess();   //access denied
//      inheritor.packageAccess();   //access denied
        inheritor.protectedAccess(); //access allowed
        inheritor.publicAccess();    //access allowed
    }
}
