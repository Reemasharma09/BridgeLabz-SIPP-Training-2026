class InsufficientFundsException extends Exception {

    public InsufficientFundsException(String msg) {
        super(msg);
    }
}

public class HospitalBillingSystem {

    public static void main(String[] args) {

        try {

            int totalBill = 5000;
            int items = 0;

            System.out.println(totalBill / items);

        } catch (ArithmeticException e) {

            System.out.println(
                    "Error: Bill cannot have zero items.");
        }

        try {

            int[] patients = {101, 102, 103};

            System.out.println(patients[5]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(
                    "Error: Invalid patient index.");
        }

        try {

            String amount = "ABC";

            int payment = Integer.parseInt(amount);

        } catch (NumberFormatException e) {

            System.out.println(
                    "Error: Invalid payment amount.");
        }

        try {

            processPayment(1000, 5000);

        } catch (InsufficientFundsException e) {

            System.out.println(e.getMessage());
        }
    }

    static void processPayment(int paid,
                               int bill)
            throws InsufficientFundsException {

        if (paid < bill) {

            throw new InsufficientFundsException(
                    "Payment failed: Insufficient funds.");
        }

        System.out.println("Payment successful.");
    }
}