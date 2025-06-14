package ControlFlows.Level2PracticePrograms;

import java.util.Scanner;

public class MultiplesBelow100 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         // get the num
        int number = input.nextInt();
        // check the Number 
        if (number <= 0 || number >= 100) {
            System.out.println("Please enter a positive integer less than 100.");
        } else {
            System.out.print("Multiples of " + number + " below 100 are: ");

            int counter = 1;
            while (counter < 100) {
                if (counter % number == 0) {
                    System.out.print(counter + " ");
                }
                counter++;
            }
            System.out.println();
        }

        input.close();
    }
}
