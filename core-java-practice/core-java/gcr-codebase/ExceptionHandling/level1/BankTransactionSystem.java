class InsufficientBalanceException
        extends Exception {

    public InsufficientBalanceException(
            String message) {

        super(message);
    }
}

class BankAccount {

    double balance = 10000;

    void withdraw(double amount)
            throws InsufficientBalanceException {

        if(amount < 0) {

            throw new IllegalArgumentException(
                    "Invalid amount!");
        }

        if(amount > balance) {

            throw new InsufficientBalanceException(
                    "Insufficient balance!");
        }

        balance -= amount;

        System.out.println(
                "Withdrawal successful, new balance: "
                        + balance);
    }
}

public class BankTransactionSystem {

    public static void main(String[] args) {

        BankAccount account =
                new BankAccount();

        try {

            account.withdraw(15000);

        } catch(InsufficientBalanceException e) {

            System.out.println(
                    e.getMessage());

        } catch(IllegalArgumentException e) {

            System.out.println(
                    e.getMessage());
        }
    }
}