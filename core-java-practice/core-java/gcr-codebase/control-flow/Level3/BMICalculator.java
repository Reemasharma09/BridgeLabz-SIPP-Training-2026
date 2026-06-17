import java.util.Scanner;
public class BMICalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight (kg): ");
        double weight = input.nextDouble();

        System.out.print("Enter height (cm): ");
        double heightInCm = input.nextDouble();

        double heightInMeter = heightInCm / 100;

        double bmi =
                weight /
                        (heightInMeter * heightInMeter);

        System.out.println("BMI = " + bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal Weight");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

        input.close();
    }
}