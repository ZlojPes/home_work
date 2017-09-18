package jv17_05.pavliuk.lesson3;

import java.io.IOException;

public class TypeCasting {
    private static byte b = Byte.MAX_VALUE;
    private static short s = Short.MAX_VALUE;
    private static char c = Character.MAX_VALUE;
    private static int i = Integer.MAX_VALUE;
    private static long l = Long.MAX_VALUE;
    private static float f = Float.MAX_VALUE;
    private static double d = Double.MAX_VALUE;
    private static boolean boo = true;
    private static String userChoice;

    public static void main(String[] args) throws IOException {
        System.out.print("Press\n\"b\"(byte)\n\"s\"(short)\n\"c\"(char)\n\"i\"(int)\n\"l\"(long)\n\"f\"(float)\n\"d\"(double)\n" +
                "to look what kind of conversion to selected type another primitive types use:");
        char choice = (char) System.in.read();
        if (choice == 'b') {
            userChoice = "byte";
            castToByte();
        } else if (choice == 's') {
            userChoice = "short";
            castToShort();
        } else if (choice == 'c') {
            userChoice = "char";
            castToChar();
        } else if (choice == 'i') {
            userChoice = "int";
            castToInt();
        } else if (choice == 'l') {
            userChoice = "long";
            castToLong();
        } else if (choice == 'f') {
            userChoice = "float";
            castToFloat();
        } else if (choice == 'd') {
            userChoice = "double";
            castToDouble();
        } else {
            System.out.print("Error. Wrong choice");
            System.exit(0);
        }
        System.out.println("Note: boolean type cannot be casted to " + userChoice + " type!");
    }

    private static void castToByte() {
        b = (byte) s;
        b = (byte) c;
        b = (byte) i;
        b = (byte) l;
        b = (byte) f;
        b = (byte) d;
        //  b = (byte) boo; ** You cannot cast boolean to another types **

        System.out.println("All primitive types use explicit casting to byte type.");
    }

    private static void castToShort() {
        s = b;
        s = (short) c;
        s = (short) i;
        s = (short) l;
        s = (short) f;
        s = (short) d;
        //  s = (short) boo; ** You cannot cast boolean to another types **
        System.out.println("byte type uses implicit casting to short type. But int, long, float and double use explicit casting to short.");
    }

    private static void castToChar() {
        c = (char) b;
        c = (char) s;
        c = (char) i;
        c = (char) l;
        c = (char) f;
        c = (char) d;
        //  c = (char) boo; ** You cannot cast boolean to another types **
        System.out.println("All primitive types use explicit casting to char.");
    }

    private static void castToInt() {
        i = b;
        i = s;
        i = c;
        i = (int) l;
        i = (int) f;
        i = (int) d;
        //  i = (int) boo; ** You cannot cast boolean to another types **
        System.out.println("byte, short and char types use implicit casting to int type. But long, float and double use explicit casting to int.");
    }

    private static void castToLong() {
        l = b;
        l = s;
        l = c;
        l = i;
        l = (long) f;
        l = (long) d;
        //  l = (long) boo; ** You cannot cast boolean to another types **
        System.out.println("byte, short, char and int types use implicit casting to long type. But float and double use explicit casting to long.");
    }

    private static void castToFloat() {
        f = b;
        f = s;
        f = c;
        f = i;
        f = l;
        f = (float) d;
        //  f = (float) boo; ** You cannot cast boolean to another types **
        System.out.println("byte, short, char, int and long types use implicit casting to float type. But double uses explicit casting to float.");
    }

    private static void castToDouble() {
        d = b;
        d = s;
        d = c;
        d = i;
        d = l;
        d = f;
        //  d = (double) boo; ** You cannot cast boolean to another types **
        System.out.println("All primitive types use implicit casting to double type.");
    }
}
