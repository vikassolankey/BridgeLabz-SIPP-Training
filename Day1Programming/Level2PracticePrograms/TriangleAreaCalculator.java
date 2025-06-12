
import java.util.Scanner;

public class TriangleAreaCalculator {

    public static void main(String[] args) {
        double base;
        double height;

        Scanner input = new Scanner(System.in);
        base = input.nextDouble();
        height = input.nextDouble();

        double areaSqCm = 0.5 * base * height;
        double areaSqIn = areaSqCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq in is " + areaSqIn + " and sq cm is " + areaSqCm);

        input.close();
    }
}

