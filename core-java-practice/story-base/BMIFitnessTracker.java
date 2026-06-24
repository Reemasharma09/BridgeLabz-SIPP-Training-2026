import java.util.Scanner;
class BMIFitnessTracker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Take height in meters
        System.out.print("Enter Height (in meters): ");
        double height = input.nextDouble();
        // Take weight in kilograms
        System.out.print("Enter Weight (in kg): ");
        double weight = input.nextDouble();
        // Calculate BMI
        double bmi = weight / (height * height);
        System.out.println("BMI = " + bmi);
        // Check BMI Category
        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        }
        else if (bmi < 25) {
            System.out.println("Category: Normal");
        }
        else {
            System.out.println("Category: Overweight");
        }
    }
}