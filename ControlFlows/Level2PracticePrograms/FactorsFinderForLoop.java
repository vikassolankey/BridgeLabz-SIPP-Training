package ControlFlows.Level2PracticePrograms;

import java.util.Scanner;

public class FactorsFinderForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input number
        int number = input.nextInt();

        // Check if number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.print("Factors of " + number + " are: ");

            // Loop to find factors from 1 to number
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println(); 
        }

        input.close();
    }
}
