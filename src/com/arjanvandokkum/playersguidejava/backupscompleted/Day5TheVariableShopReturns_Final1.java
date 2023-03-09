package com.arjanvandokkum.playersguidejava.backupscompleted;

public class Day5TheVariableShopReturns_Final1 {



    //TODO Modify your Variable Shop program to assign a new, different literal value to each of the 9 original variables. Do not declare any additional variables.
    //TODO Use System.out.println to display the updated contents of each variable.

    // 8 primitive types
    public static boolean BOOLEAN = true; // only fixed true or false possible? no 0-1 or NULL/Null?
    public static byte BYTE = 127; // byte from -128 to 127
    public static char CHAR = 65; // ASCII values from 1 to 127. or 'a' AND UNICODE
    public static short SHORT = -32_768; // Minimum:-32_768 Maximum:32_767
    public static float FLOAT = 1.12345678F; // max 8 digits after .
    public static double DOUBLE = 1.1234567890123456D; // Complete: 1.1234567890123457* max 16 digits after .

    public static void main(String[] args) {
        System.out.println("boolean = " + (BOOLEAN = false));
        System.out.println("byte = " + (BYTE = 99));
        System.out.println("char = " + (CHAR = 30000));
        System.out.println("short = " + (SHORT = 0));
        System.out.println("float = " + (FLOAT = 0.0F));
        System.out.println("double = " + (DOUBLE = 0.0001D));

        // NOTE FINAL STATIC declarations use CAPSLOCK CASE instead of camel/pascal case


    }
}