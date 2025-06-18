import java.util.Scanner;

public class NumberFormatExceptionDemo {

    public static void generateException() {
        String text = "abc123";
        int number = Integer.parseInt(text);
        System.out.println(number);
    }

    public static void handleException() {
        String text = "abc123";
        try {
            int number = Integer.parseInt(text);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
        }
    }

    public static void main(String[] args) {
        generateException();
        handleException();
    }
}
