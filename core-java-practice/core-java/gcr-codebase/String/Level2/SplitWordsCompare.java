import java.util.Scanner;

public class SplitWordsCompare {

    public static String[] customSplit(String text) {

        int wordCount = 1;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];

        int start = 0;
        int index = 0;

        for (int i = 0; i <= text.length(); i++) {

            if (i == text.length() || text.charAt(i) == ' ') {
                words[index++] = text.substring(start, i);
                start = i + 1;
            }
        }

        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {

        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i]))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] customWords = customSplit(text);
        String[] splitWords = text.split(" ");

        System.out.println("Arrays Equal : "
                + compareArrays(customWords, splitWords));

        sc.close();
    }
}