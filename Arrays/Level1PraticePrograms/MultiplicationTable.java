package Arrays.Level1PraticePrograms;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        // create Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // take a number from user
        int number = input.nextInt();

        // create an array to store multiplication table (1 to 10)
        int[] table = new int[10];

        // fill the array 
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // print 
        System.out.println("Multiplication table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        // close Scanner
        input.close();
    }
}
