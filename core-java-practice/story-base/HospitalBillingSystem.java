
import java.util.Scanner;

public class HospitalBillingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] patientBills = {5000, 7000, 9000, 12000, 15000};

        try {

            System.out.print("Enter total bill amount: ");
            String billInput = sc.nextLine();
            int totalBill = Integer.parseInt(billInput);

            System.out.print("Enter number of items: ");
            String itemInput = sc.nextLine();
            int items = Integer.parseInt(itemInput);
            double averageCost = totalBill / items;

            System.out.println("Average Cost Per Item = "
                    + averageCost);
            System.out.print("Enter patient index (0-4): ");
            int index = Integer.parseInt(sc.nextLine());

            System.out.println("Patient Bill = "
                    + patientBills[index]);

        }

        catch (NumberFormatException e) {

            System.out.println(
                    "Error: Invalid input! Please enter numbers only."
            );
        }

        catch (ArithmeticException e) {

            System.out.println(
                    "Error: Number of items cannot be zero."
            );
        }

        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(
                    "Error: Invalid patient index. Please enter a value between 0 and 4."
            );
        }

        catch (Exception e) {

            System.out.println(
                    "Unexpected Error: " + e.getMessage()
            );
        }

        finally {

            System.out.println(
                    "Hospital billing system executed safely."
            );

            sc.close();
        }
    }
}