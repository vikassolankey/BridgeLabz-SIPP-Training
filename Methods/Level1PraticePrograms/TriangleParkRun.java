package Methods.Level1PraticePrograms;

import java.util.Scanner;

public class TriangleParkRun {

    public static int calculateRounds(double sideA, double sideB, double sideC) {
        double perimeter = sideA + sideB + sideC;
        double totalDistanceMeters = 5000;
        return (int) Math.ceil(totalDistanceMeters / perimeter);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side A of the triangular park (in meters): ");
        double sideA = input.nextDouble();

        System.out.print("Enter side B of the triangular park (in meters): ");
        double sideB = input.nextDouble();

        System.out.print("Enter side C of the triangular park (in meters): ");
        double sideC = input.nextDouble();

        int roundsRequired = calculateRounds(sideA, sideB, sideC);

        System.out.println("The athlete needs to complete " + roundsRequired + " rounds to run 5 kilometers.");

        input.close();
    }
}
