package Arrays.Level1PraticePrograms;

import java.util.Scanner;

public class SumOfArrayValues {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        double[] values = new double[10];
        double total = 0.0;
        int index = 0;
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = input.nextDouble();

            if (number <= 0) {
                break;
            }

            if (index == 10) {
                break;
            }

            values[index] = number;
            index++;
        }
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(values[i]);
            total += values[i];
        }
        System.out.println("Total sum = " + total);
        input.close();
    }
}
