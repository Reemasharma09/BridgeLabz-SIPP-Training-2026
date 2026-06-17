
import java.util.Scanner;

public class NaturalNumberSumWhile {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        if (number > 0) {

            int counter = 1;
            int whileSum = 0;

            while (counter <= number) {
                whileSum += counter;
                counter++;
            }

            int formulaSum =
                    number * (number + 1) / 2;

            System.out.println("Sum using while loop = "
                    + whileSum);

            System.out.println("Sum using formula = "
                    + formulaSum);

            System.out.println("Results match? "
                    + (whileSum == formulaSum));

        } else {
            System.out.println(number
                    + " is not a natural number.");
        }

        input.close();
    }
}