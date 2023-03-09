package com.arjanvandokkum.playersguidejava.workingfiles;

public class Day4TheVariableShop {

    //TODO uild a program with a variable of all eight primitive Java types (as well as the 'text' type).
    //TODO Assign each of them a value using a literal of the correct type.
    //TODO Use System.out.println to display the contents of each variable.

    // 8 primitive types
    final public static boolean BOOLEAN = true; // only fixed true or false possible? no 0-1 or NULL/Null?
    final public static byte BYTE = 127; // byte from -128 to 127
    final public static char CHAR = 30000; // ASCII values from 1 to 127. or 'a' AND UNICODE
    final public static short SHORT = -32_768; // Minimum:-32_768 Maximum:32_767
    final public static float FLOAT = 1.12345678F; // max 8 digits after .
    final public static double DOUBLE = 1.1234567890123456D; // Complete: 1.1234567890123457* max 16 digits after .

    public static void main(String[] args) {
        System.out.println("boolean = " + BOOLEAN);
        System.out.println("byte = " + BYTE);
        System.out.println("char = " + CHAR);
        System.out.println("short = " + SHORT);
        System.out.println("float = " + FLOAT);
        System.out.println("double = " + DOUBLE);

        // NOTE FINAL STATIC declarations use CAPSLOCK CASE instead of camel/pascal case
        }
}
