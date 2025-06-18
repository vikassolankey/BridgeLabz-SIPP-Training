import java.util.Scanner;

public class UppercaseConversion {

    public static String toUppercase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            result += ch;
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String userUpper = toUppercase(text);
        String builtInUpper = text.toUpperCase();
        System.out.println("User method result: " + userUpper);
        System.out.println("Built-in result: " + builtInUpper);
        System.out.println("Are both uppercase strings equal? " + compareStrings(userUpper, builtInUpper));
        sc.close();
    }
}
