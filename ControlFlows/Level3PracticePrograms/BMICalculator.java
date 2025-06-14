package ControlFlows.Level3PracticePrograms;

import java.util.Scanner;

public class BMICalculator {
       public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        // Take input for weight in kilograms
        double weightInKg = input.nextDouble();

        // Take input for height in centimeters
        double heightInCm = input.nextDouble();

        // Convert height to meters for BMI calculation
        double heightInMeters = heightInCm / 100.0;

        // Calculate BMI using the formula: weight / (height^2)
        double bmiValue = weightInKg / (heightInMeters * heightInMeters);

        // Display BMI value
        System.out.println("Your BMI is: " + bmiValue);

        // Determine and display weight status
        if (bmiValue < 18.5) {
            System.out.println(" Underweight");
        } else if (bmiValue >= 18.5 && bmiValue < 24.9) {
            System.out.println(" Normal weight");
        } else if (bmiValue >= 25 && bmiValue < 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println(" Obese");
        }

        // Close the Scanner
        input.close();
    }
}
