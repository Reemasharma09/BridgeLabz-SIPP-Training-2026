import java.util.Scanner;
class ElectionBoothManager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Age (0 to Exit): ");
            int age = input.nextInt();
            if (age == 0) {
                break;
            }
            if (age >= 18) {
                System.out.print("Enter Vote (1, 2, 3): ");
                int vote = input.nextInt();
                System.out.println("Vote Recorded");
            } else {
                System.out.println("Not Eligible to Vote");
            }
        }
        System.out.println("Polling Closed");
    }
}