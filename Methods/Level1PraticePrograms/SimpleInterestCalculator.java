package Methods.Level1PraticePrograms;
import java.util.*;

public class SimpleInterestCalculator {

    public static double calculateSimpleInterest(double principalAmount, double annualRate, double timePeriodYears) {
        return (principalAmount * annualRate * timePeriodYears) / 100;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principalAmount = input.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double annualRate = input.nextDouble();

        System.out.print("Enter Time (in years): ");
        double timePeriodYears = input.nextDouble();

        double simpleInterest = calculateSimpleInterest(principalAmount, annualRate, timePeriodYears);

        System.out.println("\n The Simple Interest is " + simpleInterest +" for Principal " + principalAmount +", Rate of Interest " + annualRate +"% and Time " + timePeriodYears + " years.");

        input.close();
    }
}

