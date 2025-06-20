

import java.util.Scanner;

public class MaxOfThree {

    public static int takeInput(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextInt();
    }

    public static int findMaximum(int num1, int num2, int num3) {
        int max = num1;

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number1 = takeInput(sc, "Enter first number: ");
        int number2 = takeInput(sc, "Enter second number: ");
        int number3 = takeInput(sc, "Enter third number: ");

        int maximum = findMaximum(number1, number2, number3);
        System.out.println("The maximum of the three numbers is: " + maximum);

        sc.close();
    }
}
