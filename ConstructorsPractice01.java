class BankAccount {

    String accountHolder;
    long accountNumber;
    double balance;
    boolean active;
    BankAccount() {
        this.accountHolder = "Unknown";
        this.accountNumber = 0;
        this.balance = 0.0;
        this.active = false;
        System.out.println(
                "Empty bank account created."
        );
    }
    BankAccount(
            String accountHolder,
            long accountNumber
    ) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.active = true;
        System.out.println(
                "Basic bank account created."
        );
    }
    BankAccount(
            String accountHolder,
            long accountNumber,
            double balance,
            boolean active
    ) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.active = active;

        System.out.println(
                "Complete bank account created."
        );
    }
    void displayDetails() {
        System.out.println(
                "Account Holder: " + accountHolder
        );
        System.out.println(
                "Account Number: " + accountNumber
        );
        System.out.println(
                "Balance: " + balance
        );
        System.out.println(
                "Active: " + active
        );
        System.out.println();
    }
}
public class ConstructorsPractice01 {
    public static void main(String[] args) {
        BankAccount account1 =
                new BankAccount();
        BankAccount account2 =
                new BankAccount(
                        "Rahul",
                        1234567890L
                );
        BankAccount account3 =
                new BankAccount(
                        "Rishab",
                        9876543210L,
                        25000.50,
                        true
                );
        account1.displayDetails();
        account2.displayDetails();
        account3.displayDetails();
    }
}