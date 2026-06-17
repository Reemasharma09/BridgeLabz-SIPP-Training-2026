import java.util.Scanner;

public class WordLength2DArray {

    public static String[][] getWordLength(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(words[i].length());
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = text.split(" ");

        String[][] result = getWordLength(words);

        System.out.println("\nWord\tLength");
        for (String[] row : result) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
        sc.close();
    }
}