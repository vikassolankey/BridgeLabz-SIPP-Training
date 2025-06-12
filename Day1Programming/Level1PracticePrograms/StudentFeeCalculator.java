
import java.util.Scanner;

public class StudentFeeCalculator {

    public static void main(String[] args) {
        double fee;
        double discountPercent;

        Scanner input = new Scanner(System.in);

        fee = input.nextDouble();
        discountPercent = input.nextDouble();

        double discountAmount = (discountPercent / 100) * fee;
        double finalFee = fee - discountAmount;

        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalFee);

       input.close();
    }
}
