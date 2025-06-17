package Methods.Level2PraticePrograms;

import java.util.Scanner;

public class BMICalculator {

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100;
            double bmi = weight / (heightInMeters * heightInMeters);
            data[i][2] = bmi;
        }
    }

    public static String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi < 25) {
                status[i] = "Normal weight";
            } else if (bmi < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obesity";
            }
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] teamData = new double[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (in kg) of member " + (i + 1) + ": ");
            teamData[i][0] = input.nextDouble();

            System.out.print("Enter height (in cm) of member " + (i + 1) + ": ");
            teamData[i][1] = input.nextDouble();
        }

        calculateBMI(teamData);
        String[] status = getBMIStatus(teamData);

        System.out.println("\nTeam Member BMI Report:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Member " + (i + 1) +
                    " - Weight: " + teamData[i][0] + " kg, Height: " + teamData[i][1] + " cm, BMI: " +
                    String.format("%.2f", teamData[i][2]) + ", Status: " + status[i]);
        }

        input.close();
    }
}
