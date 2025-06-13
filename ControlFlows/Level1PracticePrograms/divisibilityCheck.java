package ControlFlows.Level1PracticePrograms;

import java.util.Scanner;

public class divisibilityCheck {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        boolean isDivisible = (number % 5 == 0);

        System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);

        input.close();
    }
}
