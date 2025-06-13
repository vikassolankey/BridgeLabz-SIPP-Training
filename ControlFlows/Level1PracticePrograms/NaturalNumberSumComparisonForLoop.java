package ControlFlows.Level1PracticePrograms;

import java.util.Scanner;

public class NaturalNumberSumComparisonForLoop {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n >= 1) {
            int sumFor = 0;
            for (int i = 1; i <= n; i++) {
                sumFor += i;
            }

            int sumFormula = n * (n + 1) / 2;

            System.out.println("Sum using for loop: " + sumFor);
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Both computations are equal: " + (sumFor == sumFormula));
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }

        input.close();
    }
}
