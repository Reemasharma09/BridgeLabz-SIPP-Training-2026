

import java.util.Scanner;

public class OddEvenPrinter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = input.nextInt();


        if (number > 0) {

            for (int counter = 1; counter <= number; counter++) {

                if (counter % 2 == 0) {
                    System.out.println(counter + " is Even");
                } else {
                    System.out.println(counter + " is Odd");
                }
            }
        } else {
            System.out.println("Invalid Natural Number");
        }

        input.close();
    }
}