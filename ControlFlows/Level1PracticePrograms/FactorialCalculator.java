package ControlFlows.Level1PracticePrograms;

import java.util.Scanner;

public class FactorialCalculator {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number >= 0) {
            int factorial = 1;
            int i = 1;

            while (i <= number) {
                factorial *= i;
                i++;
            }

            System.out.println("The factorial of " + number + " is " + factorial);
        } else {
            System.out.println("Please enter a non-negative integer.");
        }

        input.close();
    }
}
