package Methods.Level1PraticePrograms;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
        
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        int result = calculateSum(number);

        System.out.println("The sum of first " + number + " natural numbers is: " + result);

        input.close();
    }
}
