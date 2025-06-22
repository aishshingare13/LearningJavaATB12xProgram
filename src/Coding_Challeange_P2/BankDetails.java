package Coding_Challeange_P2;

public class BankDetails {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        account.withdraw(200);

    }
}
class BankAccount{
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative.");
            balance = 0;
        }
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Balance after deposit: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
        }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Balance after withdrawal: " + balance);
        } else if (amount <= 0) {
            System.out.println("Withdraw amount must be positive.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }
    public double getBalance() {
        return balance;
    }

}
