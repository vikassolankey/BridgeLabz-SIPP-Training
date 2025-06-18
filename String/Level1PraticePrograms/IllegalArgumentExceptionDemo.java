import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    public static void generateException() {
        String text = "hello";
        String result = text.substring(4, 2);
        System.out.println(result);
    }

    public static void handleException() {
        String text = "hello";
        try {
            String result = text.substring(4, 2);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
        }
    }

    public static void main(String[] args) {
        generateException();
        handleException();
    }
}
