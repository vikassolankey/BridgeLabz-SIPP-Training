package ControlFlows.Level3PracticePrograms;

import java.util.Scanner;

public class AbundantNumberChecker {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get integer input from user
        int number = input.nextInt();

        // Variable to store sum of divisors
        int sumOfDivisors = 0;

        // Loop to find and sum divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }

        // Check if sum is greater than number
        if (sumOfDivisors > number) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not an Abundant Number");
        }

        input.close();
    }
}
