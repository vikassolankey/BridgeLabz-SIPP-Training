package ControlFlows.Level3PracticePrograms;

import java.util.Scanner;

public class HarshadNumberChecker {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get integer input from user
        int number = input.nextInt();
        int originalNumber = number;

        // Variable to store sum of digits
        int sumOfDigits = 0;

        // While loop to find sum of digits
        while (number > 0) {
            int digit = number % 10;
            sumOfDigits += digit;
            number = number / 10;
        }

        // Check if original number is divisible by sum of its digits
        if (originalNumber % sumOfDigits == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }

        input.close();
    }
}
