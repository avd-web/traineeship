package com.arjanvandokkum.playersguidejava.workingfiles;

import java.util.Scanner;

public class Day3ChallengeConsolasAndTelim {

    private static void askUserInput() {
        System.out.println("Bread is ready.");
        Scanner scannerUserInput = new Scanner(System.in);
        System.out.println("Who is the bread for?");
        String userName = scannerUserInput.nextLine();
        System.out.println("Noted: " + userName + " got bread.");
    }
    public static void main(String[] args) {
        askUserInput();
    }
}
