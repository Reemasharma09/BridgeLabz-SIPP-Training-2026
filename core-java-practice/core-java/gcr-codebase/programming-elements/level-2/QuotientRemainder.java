import java.util.Scanner;
class QuotientRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int number1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        int number2 = input.nextInt();
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + " of two numbers "
                + number1 + " and " + number2);
    }
}