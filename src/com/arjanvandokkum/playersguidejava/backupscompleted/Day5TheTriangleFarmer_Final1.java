package com.arjanvandokkum.playersguidejava.backupscompleted;

import java.util.Scanner;

public class Day5TheTriangleFarmer_Final1 {

    // scanner function to create and return scanner & input
    public static float createScanner(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextFloat();
    }


    public static void main(String[] args) {

        System.out.println("What is the base of the triangle in mm?");
        float baseOfTriangle = createScanner(); // create scanner, ask for input and store it in float baseOfTriangle

        System.out.println("What is the height of the triangle in mm?");
        float heightOfTriangle = createScanner(); // create second scanner, ask for input and store it in float heightOfTriangle

        System.out.println((double)(baseOfTriangle * heightOfTriangle)/2);
    }
}