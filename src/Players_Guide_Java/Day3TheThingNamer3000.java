package Players_Guide_Java;

import java.util.Scanner;

public class Day3TheThingNamer3000 {

    private static void askUserInput() {
        System.out.println("Bread is ready.");
        Scanner scannerUserInput = new Scanner(System.in);
        System.out.println("Who is the bread for?");
        String userName = scannerUserInput.nextLine();
        System.out.println("Noted: " + userName + " got bread.");
    }
    private static void main(String[] args) {
        askUserInput();




    }
}
