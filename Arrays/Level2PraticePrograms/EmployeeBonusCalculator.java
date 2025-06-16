import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        final int EMPLOYEE_COUNT = 10;
        double[] salary = new double[EMPLOYEE_COUNT];
        double[] yearsOfService = new double[EMPLOYEE_COUNT];
        double[] bonus = new double[EMPLOYEE_COUNT];
        double[] newSalary = new double[EMPLOYEE_COUNT];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.println("Enter details for Employee " + (i + 1));
            while (true) {
                System.out.print("Enter Salary: ");
                salary[i] = scanner.nextDouble();
                if (salary[i] > 0) break;
                System.out.println("Invalid salary. Please enter again.");
            }
            while (true) {
                System.out.print("Enter Years of Service: ");
                yearsOfService[i] = scanner.nextDouble();
                if (yearsOfService[i] >= 0) break;
                System.out.println("Invalid years of service. Please enter again.");
            }
        }

        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\n--- Employee Salary Summary ---");
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            System.out.printf("Employee %d: Old Salary = ₹%.2f, Bonus = ₹%.2f, New Salary = ₹%.2f%n",
                    (i + 1), salary[i], bonus[i], newSalary[i]);
        }

        System.out.println("\n--- Total Summary ---");
        System.out.printf("Total Bonus Payout: ₹%.2f%n", totalBonus);
        System.out.printf("Total Old Salary: ₹%.2f%n", totalOldSalary);
        System.out.printf("Total New Salary: ₹%.2f%n", totalNewSalary);

        scanner.close();
    }
}
