
import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {

    public static void compareDates(LocalDate date1, LocalDate date2) {
        if (date1.isBefore(date2)) {
            System.out.println("First date is before the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("First date is after the second date.");
        } else {
            System.out.println("Both dates are the same.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first date (yyyy-MM-dd): ");
        LocalDate firstDate = LocalDate.parse(sc.nextLine());

        System.out.print("Enter second date (yyyy-MM-dd): ");
        LocalDate secondDate = LocalDate.parse(sc.nextLine());

        compareDates(firstDate, secondDate);
        sc.close();
    }
}
