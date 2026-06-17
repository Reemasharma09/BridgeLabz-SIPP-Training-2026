import java.util.Scanner;
import java.util.Arrays;
public class Day4 {
    public static String reverseMessage(String message) {
        String reversed = "";
        for (int i = message.length() - 1; i >= 0; i--) {
            reversed += message.charAt(i);
        }
        return reversed;
    }
    public static boolean isPalindrome(String message) {
        String reversed = reverseMessage(message);
        return message.equalsIgnoreCase(reversed);
    }
    public static int[] countVowelsAndConsonants(String message) {
        int vowels = 0;
        int consonants = 0;
        for (int i = 0; i < message.length(); i++) {
            char ch = Character.toLowerCase(message.charAt(i));
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i'
                        || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        return new int[] { vowels, consonants };
    }
    public static boolean areAnagrams(String first, String second) {
        first = first.toLowerCase().replace(" ", "");
        second = second.toLowerCase().replace(" ", "");

        if (first.length() != second.length()) {
            return false;
        }
        char[] firstArray = first.toCharArray();
        char[] secondArray = second.toCharArray();
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        return Arrays.equals(firstArray, secondArray);
    }
    public static char findFirstNonRepeatingCharacter(String text) {
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            int count = 0;

            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == current) {
                    count++;
                }
            }

            if (count == 1) {
                return current;
            }
        }
        return '\0';
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Secret Message: ");
        String message = scanner.nextLine();

        System.out.println("Reversed Message: " + reverseMessage(message));
        System.out.println("Palindrome Status: " + isPalindrome(message));

        int[] counts = countVowelsAndConsonants(message);
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);

        System.out.print("Enter First Intercept: ");
        String firstIntercept = scanner.nextLine();

        System.out.print("Enter Second Intercept: ");
        String secondIntercept = scanner.nextLine();

        System.out.println("Anagram Status: "
                + areAnagrams(firstIntercept, secondIntercept));

        System.out.print("Enter Surveillance Log: ");
        String log = scanner.nextLine();

        char result = findFirstNonRepeatingCharacter(log);

        if (result != '\0') {
            System.out.println("First Non-Repeating Character: " + result);
        } else {
            System.out.println("No Non-Repeating Character Found");
        }

        scanner.close();
    }
}