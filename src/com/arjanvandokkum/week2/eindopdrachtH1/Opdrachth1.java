package com.arjanvandokkum.week2.eindopdrachtH1;
import com.arjanvandokkum.week1.packagew1.ExamQuestions;


public class Opdrachth1 {
    static int result;
    static int answer = ExamQuestions.main();

    private static void howWrong (){
        System.out.println("How wrong are you?");
        result = 2 - answer;
    }
    public static void main(String[] args) {

        // use if statement to check if user input from package "Examquestions" is equal too "2"
        // if true, print "you are super smart :)" to terminal

        if (answer == 2){
            System.out.println("you are super smart :)");
        }
        // if false, user didn't answer correctly soo we print "you are NOT super smart :)" to terminal
        else {
            System.out.println("You are NOT super smart :(");
        }

        // use function howWrong to calculate the difference from correct answer
        howWrong();
        System.out.println(result);


        // program ends
    }
}
