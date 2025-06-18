
import java.util.Scanner;

public class StringIndexOutDemo {

    public static void generateException(String text) {
        char c = text.charAt(text.length());
    }

    public static void handleException(String text) {
        try {
            char c = text.charAt(text.length());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        handleException(text);
    }
}
