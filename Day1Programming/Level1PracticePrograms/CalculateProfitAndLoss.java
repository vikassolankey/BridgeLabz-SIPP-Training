
public class CalculateProfitAndLoss {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;
        int profit = sellingPrice-costPrice;
        float profitPercentage = (float)profit/costPrice*100;
        System.out.print("The Cost Price is INR " + costPrice + " and Selling Price is INR "+ sellingPrice+ "\n" +"The Profit is INR "+profit+ " and the Profit Percentage is "+profitPercentage);
    }
}
