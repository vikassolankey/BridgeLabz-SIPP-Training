package ControlFlows.Level1PracticePrograms;

import java.util.Scanner;

public class OddEvenPrinter {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number >= 1) {
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an even number");
                } else {
                    System.out.println(i + " is an odd number");
                }
            }
        } else {
            System.out.println("Please enter a natural number (positive integer).");
        }

        input.close();
    }
}
