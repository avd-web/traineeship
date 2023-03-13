package com.arjanvandokkum.playersguidejava.workingfiles;

import java.util.Scanner;

public class Day7TheDominionOfKings {

    private static int amountOfEstates;
    private static int amountOfDuchies;
    private static int amountOfProvinces;
    final static int ESTATE_POINTS = 1;
    final static int DUCHY_POINTS = 3;
    final static int PROVINCE_POINTS = 6;
    private static int totalPoints;

    public static int createScanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void askUserInput() {
        do {
            System.out.println("How many estates does the kingdom have?");
            amountOfEstates = createScanner();
        }
        while (amountOfEstates < 0 || amountOfEstates > 1_000);
        System.out.println("The kingdom has " + amountOfEstates + " estates.");

        do {
            System.out.println("How many duchies does the kingdom have?");
            amountOfDuchies = createScanner();
        }
        while (amountOfDuchies < 0 || amountOfDuchies > 1_000);
        System.out.println("The kingdom has " + amountOfDuchies + " duchies.");

        do {
            System.out.println("How many provinces does the kingdom have?");
            amountOfProvinces = createScanner();
        }
        while (amountOfProvinces < 0 || amountOfProvinces > 1_000);
        System.out.println("The kingdom has " + amountOfProvinces + " provinces");

    }

    public static void calculatePoints(){
        totalPoints = (amountOfEstates*ESTATE_POINTS) + (amountOfDuchies*DUCHY_POINTS) + (amountOfProvinces*PROVINCE_POINTS);
    }

    public static void main(String[] args) {
        askUserInput();
        calculatePoints();
        System.out.println("<-------------------------------------------->");
        System.out.println("The kingdom has a total points value of " + totalPoints + ".");

    }

}
