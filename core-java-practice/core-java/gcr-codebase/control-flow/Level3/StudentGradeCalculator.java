import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Physics Marks: ");
        double physicsMarks = input.nextDouble();
        System.out.print("Enter Chemistry Marks: ");
        double chemistryMarks = input.nextDouble();
        System.out.print("Enter Maths Marks: ");
        double mathsMarks = input.nextDouble();
        double totalMarks = physicsMarks + chemistryMarks + mathsMarks;
        double percentage = totalMarks / 3;
        String grade;
        String remarks;
        if (percentage >= 90) {
            grade = "A+";
            remarks = "Excellent";
        } else if (percentage >= 75) {
            grade = "A";
            remarks = "Very Good";
        } else if (percentage >= 60) {
            grade = "B";
            remarks = "Good";
        } else if (percentage >= 40) {
            grade = "C";
            remarks = "Average";
        } else {
            grade = "F";
            remarks = "Fail";
        }

        System.out.println("Percentage = " + percentage);
        System.out.println("Grade = " + grade);
        System.out.println("Remarks = " + remarks);

        input.close();
    }
}