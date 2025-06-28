package OOPS.Object_Relationships_And _Communication;

import java.util.*;

class Bank {
    private String name;
    private List<Account> accounts;

    public Bank(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void openAccount(Customer customer, double initialDeposit) {
        Account account = new Account(customer, this, initialDeposit);
        accounts.add(account);
        customer.addAccount(account);
        System.out.println("Account opened for " + customer.getName() + " at " + name);
    }

    public String getName() {
        return name;
    }
}

class Customer {
    private String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println("Accounts for " + name + ":");
        for (Account acc : accounts) {
            System.out.println("Bank: " + acc.getBank().getName() + " | Balance: ₹" + acc.getBalance());
        }
    }
}

class Account {
    private Customer customer;
    private Bank bank;
    private double balance;

    public Account(Customer customer, Bank bank, double initialDeposit) {
        this.customer = customer;
        this.bank = bank;
        this.balance = initialDeposit;
    }

    public Bank getBank() {
        return bank;
    }

    public double getBalance() {
        return balance;
    }
}

public class BankAssociation {
    public static void main(String[] args) {
        Bank sbi = new Bank("SBI");
        Bank hdfc = new Bank("HDFC");

        Customer aamir = new Customer("Aamir");
        Customer nisha = new Customer("Nisha");

        sbi.openAccount(aamir, 5000);
        hdfc.openAccount(aamir, 7000);
        hdfc.openAccount(nisha, 9000);

        System.out.println();
        aamir.viewBalance();
        System.out.println();
        nisha.viewBalance();
    }
}