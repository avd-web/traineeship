package com.arjanvandokkum.week1;

public class DayNumber {
    public static void main(String[] args) {
        int dag = 1;
        if (dag < 0 || dag > 6) {
            System.out.println("No valid value");
        }
        else if (dag == 0) {
            System.out.println("Sunday");
        }
        else if (dag == 1) {
            System.out.println("Monday");
        }
        else if (dag == 2) {
            System.out.println("Tuesday");
        }
        else if (dag == 3) {
            System.out.println("Wednesday");
        }
        else if (dag == 4) {
            System.out.println("Thursday");
        }
        else if (dag == 5) {
            System.out.println("Friday");
        }
        else if (dag == 6) {
            System.out.println("Saturday");
        }
    }
}
