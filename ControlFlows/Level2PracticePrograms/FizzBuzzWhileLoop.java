package ControlFlows.Level2PracticePrograms;

import java.util.Scanner;

public class FizzBuzzWhileLoop {
     public static void main(String[] args) {
        // Create Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // get a positive integer
        int userNumber = input.nextInt();

        // Check if the number is positive
        if (userNumber <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            int i = 1; // Initialize counter

            // Loop till i <= userNumber
            while (i <= userNumber) {
                // Check divisibility for FizzBuzz
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }

                i++;
            }
        }

        // Close Scanner
        input.close();
    }
}
