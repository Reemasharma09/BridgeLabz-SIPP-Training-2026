import java.util.Scanner;
public class StudentGrade2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();
        double[][] marks = new double[students][3];
        double[] percentage = new double[students];
        char[] grade = new char[students];
        for (int i = 0; i < students; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.print("Physics Marks: ");
            marks[i][0] = sc.nextDouble();

            System.out.print("Chemistry Marks: ");
            marks[i][1] = sc.nextDouble();

            System.out.print("Maths Marks: ");
            marks[i][2] = sc.nextDouble();

            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Invalid Marks! Enter Again.");
                i--;
            }
        }

        for (int i = 0; i < students; i++) {
            percentage[i] =
                    (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percentage[i] >= 90)
                grade[i] = 'A';
            else if (percentage[i] >= 75)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else if (percentage[i] >= 40)
                grade[i] = 'D';
            else
                grade[i] = 'F';
        }

        System.out.println("\nPercentage\tGrade");
        for (int i = 0; i < students; i++) {
            System.out.printf("%.2f\t\t%c%n",
                    percentage[i], grade[i]);
        }
        sc.close();
    }
}