package Arrays.Level1PraticePrograms;

import java.util.Scanner;

public class OddEvenArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = input.nextInt();
        if (number <= 0) {
            System.out.println("Error: Please enter a natural number greater than 0.");
            input.close();
            return;
        }

        int size = number / 2 + 1;
        int[] evenNumbers = new int[size];
        int[] oddNumbers = new int[size];

        int evenIndex = 0 , oddIndex=0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[evenIndex] = i;
                evenIndex++;
            } else {
                oddNumbers[oddIndex] = i;
                oddIndex++;
            }
        }

        System.out.println("Even numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();

        System.out.println("Odd numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();

        input.close();
    }
}
