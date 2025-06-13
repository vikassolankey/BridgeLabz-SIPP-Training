package ControlFlows.Level1PracticePrograms;

import java.util.Scanner;

public class NumberSignChecker {
     public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }

        input.close();
    }
}
