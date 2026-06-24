public class MathWizard {

    int number = 100;

    public void showScope() {


        int number = 50;

        System.out.println("Local Variable  : " + number);
        System.out.println("Instance Variable: " + this.number);
    }
    public static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static long factorial(int n) {

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static double factorial(double n) {

        double fact = 1;

        for (int i = 1; i <= (int) n; i++) {
            fact *= i;
        }

        return fact;
    }

    public static void fibonacci(int n) {

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {

            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println();
    }

    public static int gcd(int a, int b) {

        while (b != 0) {

            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public static int lcm(int a, int b) {

        return (a * b) / gcd(a, b);
    }

    public static long power(int base, int exp) {

        long result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println("Prime Check (17): "
                + isPrime(17));

        System.out.println("Factorial(5): "
                + factorial(5));

        System.out.println("Factorial(6.0): "
                + factorial(6.0));

        fibonacci(10);

        System.out.println("GCD(24,36): "
                + gcd(24, 36));

        System.out.println("LCM(24,36): "
                + lcm(24, 36));

        System.out.println("Power(2,5): "
                + power(2, 5));

        MathWizard obj = new MathWizard();
        obj.showScope();
    }
}