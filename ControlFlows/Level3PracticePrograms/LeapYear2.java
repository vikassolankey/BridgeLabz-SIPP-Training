package ControlFlows.Level3PracticePrograms;

import java.util.Scanner;

public class LeapYear2 {
     public static void main(String[] args) {
        // Create Scanner object for input
        Scanner input= new Scanner(System.in);
        // input the year
        System.out.print("Enter a year (1582 or later): ");
        int inputYear = input.nextInt();

        // Check if year is valid and a leap year using a single if condition
        if (inputYear >= 1582 && 
            ((inputYear % 400 == 0) || 
             (inputYear % 4 == 0 && inputYear % 100 != 0))) {
            System.out.println(inputYear + " is a Leap Year.");
        }
        // Handle invalid year input less than 1582
        else if (inputYear < 1582) {
            System.out.println("Year must be 1582 or later (Gregorian calendar).");
        }
        // Otherwise it is not a leap year
        else {
            System.out.println(inputYear + " is NOT a Leap Year.");
        }

        // Close Scanner
        input.close();
    }
    
}
