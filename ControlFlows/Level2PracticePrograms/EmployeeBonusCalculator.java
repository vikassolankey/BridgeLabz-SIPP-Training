package ControlFlows.Level2PracticePrograms;

import java.util.Scanner;

public class EmployeeBonusCalculator {
     public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // get the input for salary and yearsofservice       
        double salary = input.nextDouble();
        int yearsOfService = input.nextInt();

        // Declare a variable to store bonus
        double bonus = 0;

        // Check if years of service is more than 5
        if (yearsOfService > 5) {
            // Calculate 5% bonus
            bonus = 0.05 * salary;
        }

        // Display the bonus amount
        System.out.println("Bonus amount: ₹" + bonus);

        // Close the Scanner object
        input.close();
    }
}
