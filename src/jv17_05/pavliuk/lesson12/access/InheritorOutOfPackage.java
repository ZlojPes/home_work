package jv17_05.pavliuk.lesson12.access;

import jv17_05.pavliuk.lesson12.access.targetPackage.Target;

public class InheritorOutOfPackage extends Target {
    public static void main(String[] args) {
        InheritorOutOfPackage instance = new InheritorOutOfPackage();
//      instance.privateAccess(); //access denied
//      instance.packageAccess(); //access denied
        instance.protectedAccess(); //access allowed
        instance.publicAccess();    //access allowed
    }
}
