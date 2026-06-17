import java.util.Scanner;
public class AbundantNumberChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();

        int sum = 0;

        for (int divisor = 1;
             divisor < number;
             divisor++) {

            if (number % divisor == 0) {
                sum += divisor;
            }
        }

        if (sum > number) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not an Abundant Number");
        }
        input.close();
    }
}