
import java.util.Scanner;

public class DistanceConverter {

    public static void main(String[] args) {
        double distanceInFeet;

        Scanner input = new Scanner(System.in);
        distanceInFeet = input.nextDouble();

        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        System.out.println("The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles);

        input.close();
    }
}

