package ControlFlows.Level2PracticePrograms;

import java.util.Scanner;

public class MultiplicationTable {
       public static void main(String[] args) {
        // Create Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // get a number
        int number = input.nextInt();

        // Print the multiplication table from 6 to 9
        for (int i = 6; i <= 9; i++) {
            int product = number * i;  // Calculate product
            System.out.println(number + " * " + i + " = " + product);
        }

        // Close Scanner
        input.close();
    }
}
