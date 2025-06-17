package Methods.Level2PraticePrograms;

import java.util.Scanner;

public class YoungestTallestFinder {

    public static int findYoungestIndex(int[] ages) {
        int minIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int findTallestIndex(double[] heights) {
        int maxIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = input.nextInt();

            System.out.print("Enter height (in cm) of " + names[i] + ": ");
            heights[i] = input.nextDouble();
        }

        int youngestIndex = findYoungestIndex(ages);
        int tallestIndex = findTallestIndex(heights);

        System.out.println("The youngest friend is: " + names[youngestIndex] + " with age " + ages[youngestIndex]);
        System.out.println("The tallest friend is: " + names[tallestIndex] + " with height " + heights[tallestIndex] + " cm");

        input.close();
    }
}
