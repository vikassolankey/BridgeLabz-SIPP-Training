
import java.util.Scanner;

public class TotalPurchasePriceCalculator {

    public static void main(String[] args) {
        double unitPrice;
        int quantity;

        Scanner input = new Scanner(System.in);
        unitPrice = input.nextDouble();
        quantity = input.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);

        input.close();
    }
}

