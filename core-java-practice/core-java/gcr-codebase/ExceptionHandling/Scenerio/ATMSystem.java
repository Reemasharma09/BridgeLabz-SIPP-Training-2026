class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(
            double balance,
            double withdrawal) {

        super("Balance: ₹" + balance
                + ", Withdrawal Requested: ₹"
                + withdrawal);
    }
}

public class ATMSystem {

    static void withdraw(double balance,
                         double amount)
            throws InsufficientBalanceException {

        if(amount > balance) {

            throw new InsufficientBalanceException(
                    balance,
                    amount);
        }

        System.out.println(
                "Withdrawal Successful");
    }

    public static void main(String[] args) {

        try {

            withdraw(5000, 8000);

        } catch(InsufficientBalanceException e) {

            System.out.println(
                    "Insufficient Balance!");

            System.out.println(
                    e.getMessage());
        }
    }
}