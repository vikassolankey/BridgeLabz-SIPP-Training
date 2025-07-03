abstract class FoodItem{
    private String itemName;
    private double price;
    private  int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract  double  calculateTotalPrice();
    public void  getItemDetails(){
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }

}

interface Discountable{
    abstract  double  applyDiscount();
    abstract String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    private double discountRate;

    public VegItem(String itemName, double price, int quantity, double discountRate) {
        super(itemName, price, quantity);
        this.discountRate = discountRate;
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * (1 - discountRate / 100);
    }

    @Override
    public String getDiscountDetails() {
        return "Discount Rate: " + discountRate + "%";
    }
}
class NonVegItem extends FoodItem implements Discountable {
    private double discountRate;

    public NonVegItem(String itemName, double price, int quantity, double discountRate) {
        super(itemName, price, quantity);
        this.discountRate = discountRate;
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * (1 - discountRate / 100);
    }

    @Override
    public String getDiscountDetails() {
        return "Discount Rate: " + discountRate + "%";
    }
}

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        VegItem vegItem = new VegItem("Veg Pizza", 10.0, 2, 10.0);
        NonVegItem nonVegItem = new NonVegItem("Chicken Burger", 15.0, 1, 5.0);

        System.out.println("Veg Item Details:");
        vegItem.getItemDetails();
        System.out.println("Total Price: " + vegItem.calculateTotalPrice());
        System.out.println(vegItem.getDiscountDetails());
        System.out.println("Price after Discount: " + vegItem.applyDiscount());

        System.out.println("\nNon-Veg Item Details:");
        nonVegItem.getItemDetails();
        System.out.println("Total Price: " + nonVegItem.calculateTotalPrice());
        System.out.println(nonVegItem.getDiscountDetails());
        System.out.println("Price after Discount: " + nonVegItem.applyDiscount());
        
    }
    
}
