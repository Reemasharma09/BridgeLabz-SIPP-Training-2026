import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        System.out.println("Enter details for 10 employees:");

        for (int i = 0; i < salary.length; i++) {
            System.out.println("\nEmployee " + (i + 1));

            System.out.print("Enter Salary: ");
            salary[i] = scanner.nextDouble();

            System.out.print("Enter Years of Service: ");
            yearsOfService[i] = scanner.nextDouble();

            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input! Please enter again.");
                i--;
                continue;
            }
            totalOldSalary += salary[i];
        }
        for (int i = 0; i < salary.length; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }
        System.out.println("\nEmployee Salary Report");
        System.out.println(" ");
        System.out.printf("%-10s %-12s %-12s %-12s%n",
                "Employee", "Old Salary", "Bonus", "New Salary");

        for (int i = 0; i < salary.length; i++) {
            System.out.printf("%-10d %-12.2f %-12.2f %-12.2f%n",
                    (i + 1), salary[i], bonus[i], newSalary[i]);
        }
        System.out.println(" ");
        System.out.printf("Total Old Salary : %.2f%n", totalOldSalary);
        System.out.printf("Total Bonus Paid : %.2f%n", totalBonus);
        System.out.printf("Total New Salary : %.2f%n", totalNewSalary);

        scanner.close();
    }
}