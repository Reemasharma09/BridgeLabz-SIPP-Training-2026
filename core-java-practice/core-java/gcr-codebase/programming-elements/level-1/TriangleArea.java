import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Base: ");
        double base = input.nextDouble();
        System.out.print("Enter Height: ");
        double height = input.nextDouble();
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle = " + area);
    }
}