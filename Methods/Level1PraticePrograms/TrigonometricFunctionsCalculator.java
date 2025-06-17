package Methods.Level1PraticePrograms;

import java.util.Scanner;

public class TrigonometricFunctionsCalculator {

    public static double[] calculateTrigonometricFunctions(double angleInDegrees) {
        double angleInRadians = Math.toRadians(angleInDegrees);
        double sine = Math.sin(angleInRadians);
        double cosine = Math.cos(angleInRadians);
        double tangent = Math.tan(angleInRadians);
        return new double[] {sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the angle in degrees: ");
        double angle = input.nextDouble();

        double[] results = calculateTrigonometricFunctions(angle);

        System.out.println("Sine: " + results[0]);
        System.out.println("Cosine: " + results[1]);
        System.out.println("Tangent: " + results[2]);

        input.close();
    }
}

