package AssignmentTwo.project1;

import java.io.Serializable;

public abstract class BankAccount implements Serializable {
	    private int accountNumber;
	    private String holderName;
	    protected double balance;

	    public BankAccount(int accountNumber, String holderName, double balance) {
	        this.accountNumber = accountNumber;
	        this.holderName = holderName;
	        this.balance = balance;
	    }

	    // Encapsulation
	    public int getAccountNumber() {
	        return accountNumber;
	    }

	    public String getHolderName() {
	        return holderName;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    // Abstract method
	    public abstract void withdraw(double amount);

	    // Concrete methods
	    public void deposit(double amount) {
	        balance += amount;
	        System.out.println("Amount deposited successfully.");
	    }

	    public void displayDetails() {
	        System.out.println("Account No: " + accountNumber);
	        System.out.println("Name: " + holderName);
	        System.out.println("Balance: " + balance);
	    }
	}

