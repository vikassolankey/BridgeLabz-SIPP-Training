package ControlFlows.Level3PracticePrograms;

import java.util.Scanner;

public class LeapYear1 {
      public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // input year
        System.out.print("Enter a year (1582 or later): ");
        int inputYear = input.nextInt();  

        // Variable to store leap year result
        boolean isLeapYear = false;

        // Check if year is valid in Gregorian calendar
        if (inputYear >= 1582) {
            // Check divisibility by 400
            if (inputYear % 400 == 0) {
                isLeapYear = true;
            }
            // Else check divisibility by 100
            else if (inputYear % 100 == 0) {
                isLeapYear = false;
            }
            // Else check divisibility by 4
            else if (inputYear % 4 == 0) {
                isLeapYear = true;
            }
            else {
                isLeapYear = false;
            }
        } else {
            // Year less than 1582 is invalid for leap year calculation
            System.out.println("Year must be 1582 or later (Gregorian calendar).");
            input.close();
            return;  // Exit the program early
        }

        // Output
        if (isLeapYear) {
            System.out.println(inputYear + " is a Leap Year.");
        } else {
            System.out.println(inputYear + " is NOT a Leap Year.");
        }

        // Close Scanner to free resources
        input.close();
    }
}
