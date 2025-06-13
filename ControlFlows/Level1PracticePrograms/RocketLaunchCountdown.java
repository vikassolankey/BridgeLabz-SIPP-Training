package ControlFlows.Level1PracticePrograms;

import java.util.Scanner;

public class RocketLaunchCountdown {
       public static void main(String[] args) {
        int counter;

        Scanner input = new Scanner(System.in);
        counter = input.nextInt();

        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        input.close();
    }
}
