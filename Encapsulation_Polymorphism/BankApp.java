abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String acc, String name, double bal) {
        this.accountNumber = acc;
        this.holderName = name;
        this.balance = bal;
    }

    public abstract double calculateInterest();

    public void deposit(double amount) { balance += amount; }

    public void withdraw(double amount) { balance -= amount; }

    public double getBalance() { return balance; }
}

interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String acc, String name, double bal) {
        super(acc, name, bal);
    }

    public double calculateInterest() { return getBalance() * 0.04; }

    public void applyForLoan(double amount) { System.out.println("Loan applied: ₹" + amount); }

    public boolean calculateLoanEligibility() { return getBalance() > 10000; }
}

public class BankApp {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SB1001", "Neha", 20000);
        sa.deposit(5000);
        System.out.println("Balance: ₹" + sa.getBalance());
        System.out.println("Interest: ₹" + sa.calculateInterest());
        sa.applyForLoan(250000);
        System.out.println("Eligible for loan? " + sa.calculateLoanEligibility());
    }
}