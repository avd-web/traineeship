package com.arjanvandokkum.playersguidejava.workingfiles;

import java.util.Scanner;

public class Day6TheFourSistersAndTheDuckBear {

    //TODO Create a program that lets the user enter the number of chocolate eggs gathered that day.
    //TODO Using / and %, compute how many eggs each sister should get and how many are left over for the duckbear.
    //TODO Answer this question: What are three total egg counts where the duckbear gets more than each sister does? You can use the program you created to help you find the answer
    final public static int PEOPLE = 4;

    public static int createScanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        System.out.print("How many eggs are gathered today? : ");
        int amountOfEggs = createScanner();

        if (amountOfEggs > PEOPLE) {
            int eggsPerSister = amountOfEggs / PEOPLE;
            int eggsForDuckbear = amountOfEggs % PEOPLE;
            if (eggsForDuckbear == 0) {
                System.out.println("Each sister gets " + eggsPerSister + " eggs and duckbear gets none");
            } else {
                System.out.println("Each sisters gets " + eggsPerSister + " eggs and duckbear gets " + eggsForDuckbear);
            }
        }
        else{
            System.out.println("duckbear gets " + amountOfEggs + " eggs and sisters get none");
        }


    }
}
