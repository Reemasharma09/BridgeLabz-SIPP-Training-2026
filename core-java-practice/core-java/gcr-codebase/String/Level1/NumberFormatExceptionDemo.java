import java.util.Scanner;

public class NumberFormatExceptionDemo {

    public static void handleException(String text) {

        try {
            int number = Integer.parseInt(text);
            System.out.println(number);
        }
        catch (NumberFormatException e) {
            System.out.println("Exception Handled: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Value: ");
        String text = sc.next();

        handleException(text);

        sc.close();
    }
}