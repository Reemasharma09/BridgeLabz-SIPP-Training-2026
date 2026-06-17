
import java.util.Scanner;

public class StudentVotingEligibility {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] studentAges = new int[10];

        for (int index = 0; index < studentAges.length; index++) {

            System.out.print("Enter age of student "
                    + (index + 1) + ": ");

            studentAges[index] = input.nextInt();
        }

        for (int index = 0; index < studentAges.length; index++) {

            int age = studentAges[index];

            if (age < 0) {

                System.out.println("Invalid age: " + age);

            } else if (age >= 18) {

                System.out.println("The student with age "
                        + age + " can vote.");

            } else {

                System.out.println("The student with age "
                        + age + " cannot vote.");
            }
        }
        input.close();
    }
}