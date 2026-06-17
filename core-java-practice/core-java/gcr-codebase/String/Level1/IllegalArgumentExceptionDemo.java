import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    public static void handleException(String text) {

        try {
            System.out.println(text.substring(5, 2));
        }
        catch (IllegalArgumentException e) {
            System.out.println("Exception Handled: " + e);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.next();

        handleException(text);

        sc.close();
    }
}