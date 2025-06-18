
import java.util.Scanner;

public class StringCharComparison {

    public static char[] getCharactersFromString(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.next();

        char[] customChars = getCharactersFromString(text);
        char[] builtInChars = text.toCharArray();

        boolean isEqual = compareCharArrays(customChars, builtInChars);

        System.out.println("Characters using custom method:");
        for (char c : customChars) {
            System.out.print(c + " ");
        }

        System.out.println("\nCharacters using toCharArray():");
        for (char c : builtInChars) {
            System.out.print(c + " ");
        }

        System.out.println("\nAre both character arrays equal? " + isEqual);
        input.close();
    }
}
