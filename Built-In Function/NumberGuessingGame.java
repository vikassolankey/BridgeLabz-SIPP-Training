
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static int generateGuess(int low, int high, Random rand) {
        return rand.nextInt(high - low + 1) + low;
    }

    public static String getUserFeedback(Scanner sc, int guess) {
        System.out.println("Is your number " + guess + "?");
        System.out.print("Enter 'high', 'low', or 'correct': ");
        return sc.next().toLowerCase();
    }

    public static void playGame() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int low = 1;
        int high = 100;
        boolean guessedCorrectly = false;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!");

        while (!guessedCorrectly && low <= high) {
            int guess = generateGuess(low, high, rand);
            String feedback = getUserFeedback(sc, guess);

            switch (feedback) {
                case "high":
                    high = guess - 1;
                    break;
                case "low":
                    low = guess + 1;
                    break;
                case "correct":
                    guessedCorrectly = true;
                    System.out.println("Yay! I guessed your number correctly.");
                    break;
                default:
                    System.out.println("Invalid input. Please type 'high', 'low', or 'correct'.");
            }
        }

        if (!guessedCorrectly) {
            System.out.println("Hmm, something went wrong. Are you sure you gave the right feedback?");
        }

        sc.close();
    }

    public static void main(String[] args) {
        playGame();
    }
}
