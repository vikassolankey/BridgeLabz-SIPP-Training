package ControlFlows.Level2PracticePrograms;

import java.util.Scanner;

public class PowerCalculatorWhileLoop {

      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input number and power
        int number = input.nextInt();
        int power = input.nextInt();

        // Check inputs are positive
        if (number <= 0 || power < 0) {
            System.out.println("Please enter positive integers only.");
        } else {
            int result = 1;
            int counter = 0;

            // Loop to calculate power using while
            while (counter < power) {
                result *= number; // multiply result by number
                counter++;       
            }

            System.out.println(number + " raised to the power " + power + " is: " + result);
        }

        input.close();
    }
}