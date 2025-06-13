package ControlFlows.Level1PracticePrograms;

import java.util.Scanner;

public class SumUntilZero {
     public static void main(String[] args) {
        double total = 0.0;
        double userInput;

        Scanner input = new Scanner(System.in);

        while (true) {
            userInput = input.nextDouble();
            if (userInput == 0) {
                break;
            }
            total += userInput;
        }

        System.out.println("The total sum is " + total);

        input.close();
    }
}
