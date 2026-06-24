import java.util.Scanner;

// Class to manage coffee orders
class CoffeeCounterChronicles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Fixed GST Percentage
        final double GST_PERCENTAGE = 18.0;
        while (true) {
            System.out.println("\n----- Coffee Menu -----");
            System.out.println("Espresso");
            System.out.println("Latte");
            System.out.println("Cappuccino");
            System.out.println("Mocha");
            System.out.println("Type 'exit' to stop");
            System.out.print("Enter Coffee Type: ");
            String coffeeType = input.nextLine();

            // Exit condition
            if (coffeeType.equalsIgnoreCase("exit")) {
                System.out.println("Cafe Closed. Thank You!");
                break;
            }
            double coffeePrice;
            // Determine coffee price using switch
            switch (coffeeType.toLowerCase()) {

                case "espresso":
                    coffeePrice = 120;
                    break;

                case "latte":
                    coffeePrice = 150;
                    break;

                case "cappuccino":
                    coffeePrice = 180;
                    break;

                case "mocha":
                    coffeePrice = 200;
                    break;

                default:
                    System.out.println("Invalid Coffee Type!");
                    continue;
            }
            System.out.print("Enter Quantity: ");
            int quantity = input.nextInt();
            input.nextLine(); // consume newline
            // Bill Calculation
            double totalAmount = coffeePrice * quantity;
            double gstAmount = totalAmount * GST_PERCENTAGE / 100;
            double finalBill = totalAmount + gstAmount;
            // Display Bill
            System.out.println("\n----- BILL -----");
            System.out.println("Coffee Type : " + coffeeType);
            System.out.println("Quantity    : " + quantity);
            System.out.println("Amount      : ₹" + totalAmount);
            System.out.println("GST (18%)   : ₹" + gstAmount);
            System.out.println("Final Bill  : ₹" + finalBill);
        }
        input.close();
    }
}