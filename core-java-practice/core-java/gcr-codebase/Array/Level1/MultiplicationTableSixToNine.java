import java.util.Scanner;

public class MultiplicationTableSixToNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int[] results = new int[4];

        for (int i = 6; i <= 9; i++) {
            results[i - 6] = number * i;
        }

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + results[i - 6]);
        }

        scanner.close();
    }
}