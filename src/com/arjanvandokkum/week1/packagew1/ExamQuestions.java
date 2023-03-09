package com.arjanvandokkum.week1.packagew1;
import java.util.Scanner;

public class ExamQuestions {

    public static int main() {
        // print line to ask user for input
        System.out.println("Examquestion: ");
        System.out.println("what is 1+1: ");

        // create scanner object
        Scanner scanner = new Scanner(System.in);

        // return the user input as String answer
        return scanner.nextInt();
    }
}
