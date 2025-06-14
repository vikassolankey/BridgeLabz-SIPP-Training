package ControlFlows.Level3PracticePrograms;

import java.util.Scanner;

public class SimpleCalculator {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get two numbers as input
        double first = input.nextDouble();
        double second = input.nextDouble();

        // Get operator input as a string
        String op = input.next();

        // Variable to store result
        double result = 0;

        // Switch statement to perform operation
        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + result);
                break;
            case "-":
                result = first - second;
                System.out.println("Result: " + result);
                break;
            case "*":
                result = first * second;
                System.out.println("Result: " + result);
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Division by zero error");
                }
                break;
            default:
                System.out.println("Invalid Operator");
        }

        input.close();
    }
}
