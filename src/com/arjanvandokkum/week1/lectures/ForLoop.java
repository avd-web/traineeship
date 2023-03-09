package com.arjanvandokkum.week1.lectures;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 8; i >= 1; i--) {
            for (int j = 1; j <= 8; j++)
            {
                System.out.print("(" + i +"," + j + ")");
            }
            System.out.print("\n");

        }
    }
}
