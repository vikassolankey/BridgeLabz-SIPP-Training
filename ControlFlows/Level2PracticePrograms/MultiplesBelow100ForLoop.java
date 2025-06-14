package ControlFlows.Level2PracticePrograms;

import java.util.Scanner;

public class MultiplesBelow100ForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input number
        int number = input.nextInt();

        // Check input validity
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
        } else {
            System.out.print("Multiples of " + number + " below 100 are: ");

            // Loop from 1 to 99 and print multiples
            for (int i = 1; i < 100; i++) {
                if (i % number == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println(); 
        }

        input.close();
    }
}
