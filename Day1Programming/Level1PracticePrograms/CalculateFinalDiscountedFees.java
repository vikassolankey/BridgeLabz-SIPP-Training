
public class CalculateFinalDiscountedFees {

    public static void main(String[] args) {
        double courseFee = 125000;
        double discountPercentage = 10;

        double discountAmount = (discountPercentage / 100) * courseFee;
        double finalFee = courseFee - discountAmount;

        System.out.println("The discount amount is INR " + discountAmount + " and final discounted fee is INR " + finalFee);
    }
}
