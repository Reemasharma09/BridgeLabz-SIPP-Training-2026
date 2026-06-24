public class TemplePuzzle {

    static int moveCount = 0;

    public static void towerOfHanoi(int n, char source,
                                    char auxiliary,
                                    char destination) {

        if (n == 1) {
            System.out.println("Move Disk 1 from "
                    + source + " to " + destination);
            moveCount++;
            return;
        }

        towerOfHanoi(n - 1, source, destination, auxiliary);

        System.out.println("Move Disk " + n + " from "
                + source + " to " + destination);

        moveCount++;

        towerOfHanoi(n - 1, auxiliary, source, destination);
    }
    public static int binarySearch(int[] arr,
                                   int low,
                                   int high,
                                   int target) {

        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (target < arr[mid]) {
            return binarySearch(arr, low, mid - 1, target);
        }

        return binarySearch(arr, mid + 1, high, target);
    }

    public static int sumOfDigits(int num) {

        if (num == 0) {
            return 0;
        }

        return num % 10 + sumOfDigits(num / 10);
    }

    public static String reverseString(String str) {

        if (str.length() <= 1) {
            return str;
        }

        return reverseString(str.substring(1))
                + str.charAt(0);
    }
    public static boolean isBalanced(String str) {

        return checkBalance(str, 0, 0);
    }

    private static boolean checkBalance(String str,
                                        int index,
                                        int count) {

        if (count < 0) {
            return false;
        }

        if (index == str.length()) {
            return count == 0;
        }

        char ch = str.charAt(index);

        if (ch == '(') {
            return checkBalance(str, index + 1,
                    count + 1);
        }

        if (ch == ')') {
            return checkBalance(str, index + 1,
                    count - 1);
        }

        return checkBalance(str, index + 1, count);
    }

    public static void main(String[] args) {

        System.out.println("Tower Of Hanoi");

        int disks = 3;

        towerOfHanoi(disks, 'A', 'B', 'C');

        System.out.println("Total Moves = "
                + moveCount);

        System.out.println("\nBinary Search");

        int[] prices = {100, 200, 300, 400, 500};

        int index = binarySearch(prices, 0,
                prices.length - 1, 400);

        System.out.println("Price Found At Index: "
                + index);

        System.out.println("\n===== Sum Of Digits =====");

        System.out.println("Sum = "
                + sumOfDigits(12345));

        System.out.println("\n===== Reverse String =====");

        System.out.println(reverseString("Temple"));

        System.out.println("\n===== Balanced Parentheses =====");

        String expression = "((()))";

        System.out.println(expression + " -> "
                + isBalanced(expression));
    }
}