package ControlFlows.Level2PracticePrograms;

import java.util.Scanner;

public class OddEvenChecker {
     public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // get a positive integer
        int userNumber = input.nextInt();

        // Check if input is a natural number
        if (userNumber <= 0) {
            System.out.println("Please enter a positive natural number.");
        } else {
            // Loop from 1 to userNumber
            for (int currentNumber = 1; currentNumber <= userNumber; currentNumber++) {
                // Check for even or odd
                if (currentNumber % 2 == 0) {
                    System.out.println(currentNumber + " is an Even number");
                } else {
                    System.out.println(currentNumber + " is an Odd number");
                }
            }
        }

        // Close the Scanner object
        input.close();
    }
    
}
