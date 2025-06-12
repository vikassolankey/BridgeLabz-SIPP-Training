
import java.util.Scanner;

public class SquareSideCalculator {

    public static void main(String[] args) {
        double perimeter;

        Scanner input = new Scanner(System.in);
        perimeter = input.nextDouble();

        double side = perimeter / 4;

        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);

        input.close();
    }
}

