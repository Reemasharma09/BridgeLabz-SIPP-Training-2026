
import java.util.Scanner;

public class TrimStringWithoutTrim {

    public static String customTrim(String text) {

        int start = 0;
        int end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ')
            start++;

        while (end >= start && text.charAt(end) == ' ')
            end--;

        return text.substring(start, end + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String text = sc.nextLine();

        String custom = customTrim(text);
        String builtIn = text.trim();

        System.out.println("Custom Trim : " + custom);
        System.out.println("Built-in Trim : " + builtIn);
        System.out.println("Equal : " + custom.equals(builtIn));

        sc.close();
    }
}