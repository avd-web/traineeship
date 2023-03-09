package com.arjanvandokkum.playersguidejava.workingfiles;

import java.util.Scanner;

public class Day3TheThingNamer3000 {
    public static void main(String[] args) {
        System.out.println("What kind of thing are we talking about?");
        /* blueprint for new scanner object */
        Scanner input = new Scanner(System.in);

        //ask the user for a string input and store it as the name userInput1
        String userInput1 = input.nextLine();
        System.out.println("How would you describe it? Big? Azure? Tattered?");
        //ask the user for a second string input and store it as the name userInput2
        String userInput2 = input.nextLine();
        String c = "Doom";
        String d = "3000";
        System.out.println("The " + userInput2 + " " + userInput1 + " of " + c + " " + d + "!");
    }

    //TODO "Aside from comments, wat else could you do to make this code more understandable
    //Answer: give "String c" and "String d" a better descriptive name?
    //Answer: if two strings added something goes wrong
}
