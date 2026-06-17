import java.util.Scanner;

public class UpperCaseConverter {

    public static String convertToUpper(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
            }

            result += ch;
        }

        return result;
    }

    public static boolean compareStrings(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Text: ");
        String text = sc.nextLine();
        String userResult = convertToUpper(text);
        String builtInResult = text.toUpperCase();
        System.out.println("User Defined: " + userResult);
        System.out.println("Built-in: " + builtInResult);
        System.out.println("Same Result: " +
                compareStrings(userResult, builtInResult));
        sc.close();
    }
}