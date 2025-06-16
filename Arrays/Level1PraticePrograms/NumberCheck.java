package Arrays.Level1PraticePrograms;

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {

        // create Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // create an array
        int[] numbers = new int[5];

        // take input from user
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // using loop for check the numbers of array
        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];

            if (currentNumber > 0) {
                // number is positive, check even or odd
                if (currentNumber % 2 == 0) {
                    System.out.println("The number " + currentNumber + " is positive and even.");
                } else {
                    System.out.println("The number " + currentNumber + " is positive and odd.");
                }
            } else if (currentNumber < 0) {
                System.out.println("The number " + currentNumber + " is negative.");
            } else {
                System.out.println("The number is zero.");
            }
        }

        // compare first and last element of array
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        if (first == last) {
            System.out.println("First and last elements are equal.");
        } else if (first > last) {
            System.out.println("First element is greater than last element.");
        } else {
            System.out.println("First element is less than last element.");
        }

        // close Scanner
        input.close();
    }
}
