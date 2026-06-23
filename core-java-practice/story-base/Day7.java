class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
public class Day7 {
    public static void main(String[] args) {
        try {
            int totalBill = 5000;
            int items = 0;
            int costPerItem = totalBill / items;
            System.out.println(costPerItem);
        } catch (ArithmeticException e) {
            System.out.println("Error: Bill cannot have zero items.");
        }
        try {
            String[] patients = {"Rahul", "Aman", "Priya"};
            System.out.println(patients[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index.");
        }
        try {
            String amount = "ABC";
            int bill = Integer.parseInt(amount);
            System.out.println(bill);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number entered.");
        }
        try {
            double billAmount = 10000;
            double payment = 5000;
            processPayment(payment, billAmount);
        } catch (InsufficientFundsException e) {
            System.out.println("Payment Failed: " + e.getMessage());
        }
    }
    public static void processPayment(double payment,
                                      double billAmount)
            throws InsufficientFundsException {
        if (payment < billAmount) {
            throw new InsufficientFundsException(
                    "Insufficient funds to clear hospital bill."
            );
        }
        System.out.println("Payment Successful.");
    }
}