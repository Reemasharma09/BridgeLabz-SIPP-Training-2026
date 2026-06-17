
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        for (int multiplier = 6; multiplier <= 9; multiplier++) {

            int result = number * multiplier;

            System.out.println(number + " * "
                    + multiplier + " = " + result);
        }

        input.close();
    }
}