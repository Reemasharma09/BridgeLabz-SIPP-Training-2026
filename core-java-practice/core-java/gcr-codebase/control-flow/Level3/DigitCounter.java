import java.util.Scanner;

public class DigitCounter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();

        int count = 0;
        int tempNumber = Math.abs(number);

        while (tempNumber != 0) {
            tempNumber = tempNumber / 10;
            count++;
        }

        if (number == 0) {
            count = 1;
        }

        System.out.println("Number of Digits = " + count);

        input.close();
    }
}