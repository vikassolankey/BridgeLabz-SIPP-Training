package ControlFlows.Level2PracticePrograms;

import java.util.Scanner;

public class YoungestAndTallestFinder {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input ages
        int amarAge = input.nextInt();
        int akbarAge = input.nextInt();
        int anthonyAge = input.nextInt();

        // Input heights
        double amarHeight = input.nextDouble();
        double akbarHeight = input.nextDouble();
        double anthonyHeight = input.nextDouble();

        // Find youngest age
        int youngestAge = amarAge;
        String youngestFriend = "Amar";

        if (akbarAge < youngestAge) {
            youngestAge = akbarAge;
            youngestFriend = "Akbar";
        }
        if (anthonyAge < youngestAge) {
            youngestAge = anthonyAge;
            youngestFriend = "Anthony";
        }

        // Find tallest height
        double tallestHeight = amarHeight;
        String tallestFriend = "Amar";

        if (akbarHeight > tallestHeight) {
            tallestHeight = akbarHeight;
            tallestFriend = "Akbar";
        }
        if (anthonyHeight > tallestHeight) {
            tallestHeight = anthonyHeight;
            tallestFriend = "Anthony";
        }

        // Print results
        System.out.println("Youngest friend: " + youngestFriend + " (" + youngestAge + " years old)");
        System.out.println("Tallest friend: " + tallestFriend + " (" + tallestHeight + " cm)");

        input.close(); // close input
    }
}
