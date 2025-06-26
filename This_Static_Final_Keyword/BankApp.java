

class BankAccount {
   
    static String bankName = "Codeverse Bank";
    static int totalAccounts = 0;

    
    private String accountHolderName;
    private final int accountNumber;

    
    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }


    public static void getTotalAccounts() {
        System.out.println("Total accounts created: " + totalAccounts);
    }

   
    public void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        }
    }
}

public class BankApp {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Aarav Sharma", 1001);
        BankAccount acc2 = new BankAccount("Meera Kapoor", 1002);

        acc1.displayDetails();
        System.out.println("-----");
        acc2.displayDetails();

       
        BankAccount.getTotalAccounts();
    }
}
