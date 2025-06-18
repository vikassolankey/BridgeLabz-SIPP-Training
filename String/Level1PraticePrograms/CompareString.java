
import java.util.Scanner;

public class CompareString {

    public static boolean compareString(String str1, String str2) {

        boolean result1 = true;

        if (str1.length() != str2.length()) {
            result1 = false;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    result1 = false;
                    break;
                }
            }
        }
        boolean result2 = str1.equals(str2);

        return result1==result2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        boolean result = compareString(str1, str2);
        System.out.println(result);
    }
}
