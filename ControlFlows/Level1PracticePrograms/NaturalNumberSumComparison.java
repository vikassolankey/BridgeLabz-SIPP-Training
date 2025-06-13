package ControlFlows.Level1PracticePrograms;

import java.util.Scanner;

public class NaturalNumberSumComparison {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        if (n >= 1) {
            int sumWhile = 0;
            int count = 1;

            while (count <= n) {
                sumWhile += count;
                count++;
            }

            int sumFormula = n * (n + 1) / 2;

            System.out.println("Sum using while loop: " + sumWhile);
            System.out.println("Sum using formula: " + sumFormula);
            System.out.println("Both computations are equal: " + (sumWhile == sumFormula));
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }

        input.close();
    }
}
