package ControlFlows.Level2PracticePrograms;

import java.util.Scanner;

public class GreatestFactorForLoop {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input number
        int number = input.nextInt();

        // Initialize greatestFactor to 1 by default
        int greatestFactor = 1;

        // Loop from number-1 down to 1
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break; // Found the greatest factor, break the loop
            }
        }

        // Display the greatest factor
        System.out.println("Greatest factor of " + number + " besides itself is: " + greatestFactor);

        input.close();
    }
}
