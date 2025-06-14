package ControlFlows.Level3PracticePrograms;

import java.util.Scanner;

public class GradeCalculator {
       public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner inputScanner = new Scanner(System.in);

        // Input marks for Physics, Chemistry, and Maths
        System.out.print("Enter marks for Physics: ");
        double physicsMarks = inputScanner.nextDouble();

        System.out.print("Enter marks for Chemistry: ");
        double chemistryMarks = inputScanner.nextDouble();

        System.out.print("Enter marks for Maths: ");
        double mathsMarks = inputScanner.nextDouble();

        // Calculate total marks obtained
        double totalMarks = physicsMarks + chemistryMarks + mathsMarks;

        // Calculate percentage (assuming max marks for each subject is 100)
        double percentage = (totalMarks / 300) * 100;

        // Declare variables for grade and remarks
        String grade;
        String remarks;

        // Calculate grade and remarks based on percentage - You can customize these conditions & messages
        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Level 2, below ,but approching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Level 1, well blow agency-normalized standards";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Level 1, to below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        // Print the results clearly
        System.out.println("\nAverage Percentage: " + String.format("%.2f", percentage) + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        // Close scanner
        inputScanner.close();
    }
 
}
