package ControlFlows.Level2PracticePrograms;

import java.util.Scanner;

public class GreatestFactorWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input number
        int number = input.nextInt();

        // Initialize greatestFactor to 1 by default
        int greatestFactor = 1;

        // Initialize counter starting from number - 1
        int counter = number - 1;

        // Loop while counter is >= 1
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break; // Found the greatest factor, break the loop
            }
            counter--; 
        }

        // Display the greatest factor
        System.out.println("Greatest factor of " + number + " besides itself is: " + greatestFactor);

        input.close();
    }
}
