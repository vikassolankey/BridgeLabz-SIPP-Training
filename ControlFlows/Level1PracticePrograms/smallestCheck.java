package ControlFlows.Level1PracticePrograms;

import java.util.Scanner;

public class smallestCheck {
  public static void main(String[] args) {
       int number1, number2, number3;

        Scanner input = new Scanner(System.in);
        number1 = input.nextInt();
        number2 = input.nextInt();
        number3 = input.nextInt();

        boolean isFirstSmallest = number1 <= number2 && number1 <= number3;

        System.out.println("Is the first number the smallest? " + isFirstSmallest);

        input.close();
    }
  }
    

