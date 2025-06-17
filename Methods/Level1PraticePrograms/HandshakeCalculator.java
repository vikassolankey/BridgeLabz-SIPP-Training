package Methods.Level1PraticePrograms;

import java.util.Scanner;

public class HandshakeCalculator {

    public static int calculateMaximumHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        int totalHandshakes = calculateMaximumHandshakes(numberOfStudents);

        System.out.println("Maximum number of handshakes possible among " + numberOfStudents + " students is: " + totalHandshakes);

        input.close();
    }
}
