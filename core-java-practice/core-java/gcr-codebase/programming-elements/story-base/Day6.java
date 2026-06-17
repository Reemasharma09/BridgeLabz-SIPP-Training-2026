import java.util.Scanner;
public class Day6 {
    static int moveCount = 0;

    public static void towerOfHanoi(int disks, char source,
                                    char auxiliary, char destination) {

        if (disks == 1) {
            System.out.println("Move Disk 1 from "
                    + source + " to " + destination);
            moveCount++;
            return;
        }

        towerOfHanoi(disks - 1, source, destination, auxiliary);

        System.out.println("Move Disk " + disks + " from "
                + source + " to " + destination);
        moveCount++;

        towerOfHanoi(disks - 1, auxiliary, source, destination);
    }

    public static int binarySearch(int[] array,
                                   int left,
                                   int right,
                                   int target) {

        if (left > right) {
            return -1;
        }

        int middle = left + (right - left) / 2;

        if (array[middle] == target) {
            return middle;
        }

        if (target < array[middle]) {
            return binarySearch(array, left,
                    middle - 1, target);
        }

        return binarySearch(array,
                middle + 1, right, target);
    }

    public static int sumOfDigits(int number) {

        if (number == 0) {
            return 0;
        }

        return (number % 10)
                + sumOfDigits(number / 10);
    }

    public static String reverseString(String text) {

        if (text.length() <= 1) {
            return text;
        }

        return reverseString(text.substring(1))
                + text.charAt(0);
    }
    public static boolean isBalanced(String text) {
        return checkBalance(text, 0, 0);
    }

    private static boolean checkBalance(String text,
                                        int index,
                                        int count) {

        if (count < 0) {
            return false;
        }

        if (index == text.length()) {
            return count == 0;
        }

        char currentCharacter = text.charAt(index);

        if (currentCharacter == '(') {
            return checkBalance(text,
                    index + 1, count + 1);
        }

        if (currentCharacter == ')') {
            return checkBalance(text,
                    index + 1, count - 1);
        }

        return checkBalance(text,
                index + 1, count);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter Number of Disks: ");
        int disks = scanner.nextInt();

        System.out.println("\nTower of Hanoi Moves:");
        towerOfHanoi(disks, 'A', 'B', 'C');

        System.out.println("Total Moves = "
                + moveCount);

        int[] prices = {100, 200, 300, 400, 500, 600};

        System.out.print("\nEnter Price to Search: ");
        int target = scanner.nextInt();

        int index = binarySearch(prices,
                0, prices.length - 1, target);

        if (index != -1) {
            System.out.println("Price Found at Index: "
                    + index);
        } else {
            System.out.println("Price Not Found");
        }

        System.out.print("\nEnter Number: ");
        int number = scanner.nextInt();

        System.out.println("Sum of Digits = "
                + sumOfDigits(number));

        scanner.nextLine();

        System.out.print("\nEnter String: ");
        String text = scanner.nextLine();

        System.out.println("Reversed String = "
                + reverseString(text));

        System.out.print(
                "\nEnter Parentheses Expression: ");
        String expression = scanner.nextLine();

        System.out.println("Balanced = "
                + isBalanced(expression));

        scanner.close();
    }
}