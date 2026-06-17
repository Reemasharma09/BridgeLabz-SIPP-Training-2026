import java.util.Scanner;
public class Day5 {
    int instanceVariable = 100;
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static long factorial(int number) {
        long factorialResult = 1;
        for (int i = 1; i <= number; i++) {
            factorialResult *= i;
        }
        return factorialResult;
    }
    public static double factorial(double number) {
        double factorialResult = 1.0;
        for (int i = 1; i <= (int) number; i++) {
            factorialResult *= i;
        }

        return factorialResult;
    }
    public static void fibonacci(int terms) {
        int firstNumber = 0;
        int secondNumber = 1;
        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= terms; i++) {
            System.out.print(firstNumber + " ");
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }

        System.out.println();
    }
    public static int gcd(int firstNumber, int secondNumber) {
        while (secondNumber != 0) {
            int temp = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = temp;
        }
        return firstNumber;
    }
    public static int lcm(int firstNumber, int secondNumber) {
        return (firstNumber * secondNumber)
                / gcd(firstNumber, secondNumber);
    }
    public static long power(int base, int exponent) {
        long result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }
    public void showScopeDifference() {
        int localVariable = 50;
        System.out.println("Local Variable = " + localVariable);
        System.out.println("Instance Variable = " + instanceVariable);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check Prime: ");
        int primeNumber = scanner.nextInt();
        System.out.println("Is Prime: " + isPrime(primeNumber));
        System.out.print("Enter integer for Factorial: ");
        int factorialNumber = scanner.nextInt();
        System.out.println("Factorial = "
                + factorial(factorialNumber));
        System.out.print("Enter double value for Factorial: ");
        double doubleNumber = scanner.nextDouble();
        System.out.println("Factorial (Double) = "
                + factorial(doubleNumber));
        System.out.print("Enter number of Fibonacci terms: ");
        int fibonacciTerms = scanner.nextInt();
        fibonacci(fibonacciTerms);
        System.out.print("Enter first number for GCD and LCM: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number for GCD and LCM: ");
        int secondNumber = scanner.nextInt();
        System.out.println("GCD = "
                + gcd(firstNumber, secondNumber));
        System.out.println("LCM = "
                + lcm(firstNumber, secondNumber));
        System.out.print("Enter Base: ");
        int base = scanner.nextInt();
        System.out.print("Enter Exponent: ");
        int exponent = scanner.nextInt();
        System.out.println("Power = "
                + power(base, exponent));
        Day5 mathWizard = new Day5();
        mathWizard.showScopeDifference();
        scanner.close();
    }
}