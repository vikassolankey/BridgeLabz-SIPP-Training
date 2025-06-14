package ControlFlows.Level2PracticePrograms;

import java.util.Scanner;

public class PowerCalculatorForLoop {
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

            // Loop to calculate power
            for (int i = 1; i <= power; i++) {
                result *= number; // multiply result by number
            }

            System.out.println(number + " raised to the power " + power + " is: " + result);
        }

        input.close(); // close input
    }
}
