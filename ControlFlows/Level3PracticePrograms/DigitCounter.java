package ControlFlows.Level3PracticePrograms;

import java.util.Scanner;

public class DigitCounter {
     public static void main(String[] args) {
        // Create Scanner object for input
        Scanner input = new Scanner(System.in);

        // Get user input
        int number = input.nextInt();

        // Variable to store count of digits
        int count = 0;

        // Special case: if the number is 0, it has 1 digit
        if (number == 0) {
            count = 1;
        } else {
            // Make number positive if it is negative
            number = Math.abs(number);

            // Loop to count digits
            while (number != 0) {
                number = number / 10; // Remove last digit
                count++;
            }
        }

        System.out.println("Number of digits: " + count);

        // Close the scanner
        input.close();
    }
}
