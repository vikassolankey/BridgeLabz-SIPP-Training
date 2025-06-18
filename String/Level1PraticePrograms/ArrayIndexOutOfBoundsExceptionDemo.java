import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

    public static void generateException() {
        String[] names = {"Amar", "Akbar", "Anthony"};
        System.out.println(names[3]);
    }

    public static void handleException() {
        String[] names = {"Amar", "Akbar", "Anthony"};
        try {
            System.out.println(names[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught");
        }
    }

    public static void main(String[] args) {
        generateException();
        handleException();
    }
}
