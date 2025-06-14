package ControlFlows.Level2PracticePrograms;

import java.util.Scanner;

public class FizzBuzzForLoop {
     public static void main(String[] args) {
        // Create Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // get the number
        int userNumber = input.nextInt();

        // Check if the number is a positive integer
        if (userNumber <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            // Loop from 1 to the entered number
            for (int i = 1; i <= userNumber; i++) {
                // Check divisibility for FizzBuzz logic
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i); 
                }
            }
        }

        // Close Scanner
        input.close();
    }
}
