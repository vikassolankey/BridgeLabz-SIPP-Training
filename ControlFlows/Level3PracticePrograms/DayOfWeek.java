package ControlFlows.Level3PracticePrograms;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        // Create Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        // Get input for month, day, and year
        int m = input.nextInt(); // Month (1–12)
        int d = input.nextInt(); // Day (1–31)
        int y = input.nextInt(); // Year (1582 or later)

        // Step 1: Adjust year
        int y0 = y - (14 - m) / 12;

        // Step 2: Calculate x using formula
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        // Step 3: Adjust month
        int m0 = m + 12 * ((14 - m) / 12) - 2;

        // Step 4: Final calculation for day of week
        int d0 = (d + x + 31 * m0 / 12) % 7;

        // Print result: 0 = Sunday, 1 = Monday, ..., 6 = Saturday
        System.out.println("Day of week (0=Sunday, ..., 6=Saturday): " + d0);

        // Close the Scanner
        input.close();
    }   
}
