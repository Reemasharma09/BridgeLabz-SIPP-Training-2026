
import java.util.Scanner;

public class WarehouseManagement {

    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    // Method to print array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        int[] stock = new int[n];

        System.out.println("Enter stock quantities:");

        for (int i = 0; i < n; i++) {
            stock[i] = sc.nextInt();
        }

        int max = stock[0];
        int min = stock[0];
        int totalStock = 0;

        for (int i = 0; i < n; i++) {

            if (stock[i] > max) {
                max = stock[i];
            }

            if (stock[i] < min) {
                min = stock[i];
            }

            totalStock += stock[i];
        }

        System.out.println("\nMaximum Stock = " + max);
        System.out.println("Minimum Stock = " + min);
        System.out.println("Total Stock = " + totalStock);

        System.out.println("\nDuplicate Quantities:");

        boolean duplicateFound = false;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {

                if (stock[i] == stock[j]) {
                    System.out.println(stock[i]);
                    duplicateFound = true;
                    break;
                }
            }
        }

        if (!duplicateFound) {
            System.out.println("No Duplicates Found");
        }

        System.out.print("\nEnter k positions to rotate: ");
        int k = sc.nextInt();

        rotateArray(stock, k);

        System.out.println("Stock After Rotation:");
        printArray(stock);

        System.out.print("\nEnter rows of shelf grid: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns of shelf grid: ");
        int cols = sc.nextInt();

        int[][] shelf = new int[rows][cols];

        System.out.println("Enter shelf grid values:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {
                shelf[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nTranspose of Shelf Grid:");

        for (int j = 0; j < cols; j++) {

            for (int i = 0; i < rows; i++) {
                System.out.print(shelf[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}