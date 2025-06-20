
import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {

    public static void performDateArithmetic(LocalDate inputDate) {
        LocalDate modifiedDate = inputDate.plusDays(7).plusMonths(1).plusYears(2);
        LocalDate finalDate = modifiedDate.minusWeeks(3);

        System.out.println("Original Date     : " + inputDate);
        System.out.println("After Additions   : " + modifiedDate);
        System.out.println("After Subtracting 3 Weeks: " + finalDate);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date (yyyy-MM-dd): ");
        String dateStr = sc.nextLine();
        LocalDate inputDate = LocalDate.parse(dateStr);

        performDateArithmetic(inputDate);

        sc.close();
    }
}
