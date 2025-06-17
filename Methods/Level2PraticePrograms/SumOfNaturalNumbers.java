package Methods.Level2PraticePrograms;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive natural number.");
        } else {
            int sumRecursive = recursiveSum(number);
            int sumFormula = formulaSum(number);

            System.out.println("Sum using recursion: " + sumRecursive);
            System.out.println("Sum using formula: " + sumFormula);

            if (sumRecursive == sumFormula) {
                System.out.println("Both methods give the same result.");
            } else {
                System.out.println("Results do not match.");
            }
        }
        input.close();
    }
}
