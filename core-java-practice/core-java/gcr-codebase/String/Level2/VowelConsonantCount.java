import java.util.Scanner;

public class VowelConsonantCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String text = sc.nextLine();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {

            char ch = Character.toLowerCase(text.charAt(i));

            if (ch >= 'a' && ch <= 'z') {

                if ("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);

        sc.close();
    }
}