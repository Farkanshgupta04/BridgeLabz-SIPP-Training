package OOPS.Class_and_Objects.Level-02;

class BankAccount {
    String accountHolder;
    long accountNumber;
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void displayBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.accountHolder = "Rahul";
        acc.accountNumber = 202312345;
        acc.balance = 10000.0;

        acc.deposit(5000);
        acc.withdraw(3000);
        acc.displayBalance();
    }
}