package ControlFlows.Level3PracticePrograms;

import java.util.Scanner;

public class ArmstrongNum {
     public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // input num
        int number = input.nextInt();

        // Declare and initialize variables
        int sumOfCubes = 0;
        int originalNumber = number;

        // Loop to extract each digit and calculate the cube and sum
        while (originalNumber != 0) {
            // Get the last digit
            int digit = originalNumber % 10;

            // Add the cube of the digit to the sum
            sumOfCubes += digit * digit * digit;

            // Remove the last digit
            originalNumber = originalNumber / 10;
        }

        // Check and display if the number is Armstrong
        if (sumOfCubes == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is NOT an Armstrong number.");
        }

        // Close the scanner
        input.close();
    }
}
