package ControlFlows.Level2PracticePrograms;

import java.util.Scanner;

public class FactorsFinderWhileLoop {
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input number
        int number = input.nextInt();

        // Check if number is positive
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            System.out.print("Factors of " + number + " are: ");

            int i = 1; // Initialize counter
            while (i <= number) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
                i++; 
            }
            System.out.println(); 
        }

        input.close();
    }
}
