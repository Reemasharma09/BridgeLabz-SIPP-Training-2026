import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        double[] physics = new double[students];
        double[] chemistry = new double[students];
        double[] maths = new double[students];
        double[] percentage = new double[students];
        char[] grade = new char[students];

        for (int i = 0; i < students; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Physics Marks: ");
            physics[i] = sc.nextDouble();

            System.out.print("Chemistry Marks: ");
            chemistry[i] = sc.nextDouble();

            System.out.print("Maths Marks: ");
            maths[i] = sc.nextDouble();

            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Invalid Marks! Enter Again.");
                i--;
            }
        }

        for (int i = 0; i < students; i++) {
            percentage[i] =
                    (physics[i] + chemistry[i] + maths[i]) / 3.0;

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