package ControlFlows.Level1PracticePrograms;

import java.util.Scanner;

public class VotingEligibilityChecker {
     public static void main(String[] args) {
        int age;

        Scanner input = new Scanner(System.in);
        age = input.nextInt();

        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        input.close();
    }
}
