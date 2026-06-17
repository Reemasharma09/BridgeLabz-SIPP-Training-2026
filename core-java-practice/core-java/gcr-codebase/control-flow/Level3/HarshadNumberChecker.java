import java.util.Scanner;

public class HarshadNumberChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = input.nextInt();
        int tempNumber = number;
        int sumOfDigits = 0;
        while (tempNumber != 0) {
            int digit = tempNumber % 10;
            sumOfDigits += digit;
            tempNumber = tempNumber / 10;
        }
        if (number % sumOfDigits == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }
        input.close();
    }
}