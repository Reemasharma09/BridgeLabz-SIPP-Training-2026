
import java.util.Scanner;

public class SpyAgency {


    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter secret message: ");
        String message = sc.nextLine();

        String reversed = "";

        for (int i = message.length() - 1; i >= 0; i--) {
            reversed += message.charAt(i);
        }

        System.out.println("Reversed Message: " + reversed);

        if (message.equalsIgnoreCase(reversed)) {
            System.out.println("Message is a Palindrome");
        } else {
            System.out.println("Message is NOT a Palindrome");
        }
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < message.length(); i++) {

            char ch = Character.toLowerCase(message.charAt(i));

            if (Character.isLetter(ch)) {

                if (isVowel(ch)) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);

        // Anagram Check
        System.out.print("\nEnter first intercept: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second intercept: ");
        String str2 = sc.nextLine();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        boolean isAnagram = true;

        if (str1.length() != str2.length()) {
            isAnagram = false;
        } else {

            int[] freq = new int[256];

            for (int i = 0; i < str1.length(); i++) {
                freq[str1.charAt(i)]++;
                freq[str2.charAt(i)]--;
            }

            for (int count : freq) {
                if (count != 0) {
                    isAnagram = false;
                    break;
                }
            }
        }

        if (isAnagram) {
            System.out.println("Intercepts are Anagrams");
        } else {
            System.out.println("Intercepts are NOT Anagrams");
        }

        System.out.print("\nEnter surveillance log: ");
        String log = sc.nextLine();

        int[] frequency = new int[256];

        for (int i = 0; i < log.length(); i++) {
            frequency[log.charAt(i)]++;
        }

        char firstNonRepeating = '\0';

        for (int i = 0; i < log.length(); i++) {
            if (frequency[log.charAt(i)] == 1) {
                firstNonRepeating = log.charAt(i);
                break;
            }
        }

        if (firstNonRepeating != '\0') {
            System.out.println("First Non-Repeating Character: "
                    + firstNonRepeating);
        } else {
            System.out.println("No Non-Repeating Character Found");
        }
        sc.close();
    }
}