class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }

    public static void transfer(BankAccount sender, BankAccount receiver, double amount) {
        if (amount > 0 && sender.getBalance() >= amount) {
            sender.withdraw(amount);
            receiver.deposit(amount);
            System.out.println("Transferred $" + amount + " from " + sender.getAccountNumber() + " to " + receiver.getAccountNumber());
        } else {
            System.out.println("Invalid transfer amount or insufficient balance");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("12345", "Alice", 1000.0);
        BankAccount account2 = new BankAccount("67890", "Bob", 1500.0);

        account1.displayAccountInfo();
        account2.displayAccountInfo();

        account1.deposit(500.0);
        account2.withdraw(200.0);

        account1.displayAccountInfo();
        account2.displayAccountInfo();

        BankAccount.transfer(account1, account2, 300.0);

        account1.displayAccountInfo();
        account2.displayAccountInfo();
    }
}
