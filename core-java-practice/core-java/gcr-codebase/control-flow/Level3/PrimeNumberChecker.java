import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {

            for (int divisor = 2;
                 divisor < number;
                 divisor++) {

                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is Prime");
        } else {
            System.out.println(number + " is Not Prime");
        }
        input.close();
    }
}