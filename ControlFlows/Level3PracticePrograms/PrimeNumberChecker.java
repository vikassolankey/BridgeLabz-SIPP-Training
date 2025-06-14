package ControlFlows.Level3PracticePrograms;

import java.util.Scanner;

public class PrimeNumberChecker {
      public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);
        //input num
        int inputNumber = input.nextInt();

        // Variable to store prime check result
        boolean isPrime = true;

        // Check if number is greater than 1
        if (inputNumber <= 1) {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        } else {
            // Loop from 2 to inputNumber-1 to check for divisors
            for (int i = 2; i <= inputNumber / 2; i++) {
                if (inputNumber % i == 0) {
                    // Number is divisible by i, so not prime
                    isPrime = false;
                    break;  
                }
            }
        }

        // Print the result based on isPrime value
        if (isPrime) {
            System.out.println(inputNumber + " is a Prime Number.");
        } else {
            System.out.println(inputNumber + " is NOT a Prime Number.");
        }

        // Close Scanner to free resources
        input.close();
    }
}
