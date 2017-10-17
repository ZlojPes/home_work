package jv17_05.pavliuk.lesson12.access.targetPackage;

public class InheritorSamePackage extends Target {
    public static void main(String[] args) {
        InheritorSamePackage inheritor = new InheritorSamePackage();
//      inheritor.privateAccess();   //access denied
        inheritor.packageAccess();   //access allowed
        inheritor.protectedAccess(); //access allowed
        inheritor.publicAccess();    //access allowed
    }
}
