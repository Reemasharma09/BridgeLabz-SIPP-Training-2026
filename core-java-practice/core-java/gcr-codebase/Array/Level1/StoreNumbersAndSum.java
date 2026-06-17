import java.util.Scanner;

public class StoreNumbersAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            System.out.print("Enter a positive number: ");
            double number = scanner.nextDouble();

            if (number <= 0 || index == numbers.length) {
                break;
            }

            numbers[index] = number;
            index++;
        }

        System.out.println("\nNumbers Entered:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        System.out.println("Total Sum = " + total);
        scanner.close();
    }
}