package AssignmentOne;

import java.util.Scanner;

//BankAccount class
class BankAccount {
 private int accountNumber;
 private String accountHolderName;
 private double balance;

 // Constructor
 public BankAccount(int accNo, String name, double initialBalance) {
     accountNumber = accNo;
     accountHolderName = name;
     if (initialBalance >= 0) {
         balance = initialBalance;
     } else {
         balance = 0;
         System.out.println("Initial balance cannot be negative. Balance set to 0.");
     }
 }

 // Deposit method
 public void deposit(double amount) throws IllegalArgumentException {
     if (amount <= 0) {
         throw new IllegalArgumentException("Deposit amount must be positive.");
     }
     balance += amount;
     System.out.println("Amount deposited successfully.");
 }

 // Withdraw method
 public void withdraw(double amount) throws IllegalArgumentException {
     if (amount <= 0) {
         throw new IllegalArgumentException("Withdrawal amount must be positive.");
     }
     if (amount > balance) {
         throw new IllegalArgumentException("Insufficient balance.");
     }
     balance -= amount;
     System.out.println("Amount withdrawn successfully.");
 }

 // Balance enquiry
 public double getBalance() {
     return balance;
 }

 // Display account details
 public void displayAccountDetails() {
     System.out.println("\n--- Account Details ---");
     System.out.println("Account Number : " + accountNumber);
     System.out.println("Account Holder : " + accountHolderName);
     System.out.println("Balance        : ₹" + balance);
 }
}

//Main class
 class BankManagement {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     BankAccount account = null;

     int choice;
     do {
         System.out.println("\n===== Bank Management System =====");
         System.out.println("1. Create Account");
         System.out.println("2. Deposit");
         System.out.println("3. Withdraw");
         System.out.println("4. Balance Enquiry");
         System.out.println("5. Display Account Details");
         System.out.println("6. Exit");
         System.out.print("Enter your choice: ");
         choice = sc.nextInt();

         try {
             switch (choice) {
                 case 1:
                     System.out.print("Enter Account Number: ");
                     int accNo = sc.nextInt();
                     sc.nextLine();

                     System.out.print("Enter Account Holder Name: ");
                     String name = sc.nextLine();

                     System.out.print("Enter Initial Balance: ");
                     double bal = sc.nextDouble();

                     account = new BankAccount(accNo, name, bal);
                     System.out.println("Account created successfully.");
                     break;

                 case 2:
                     if (account == null) {
                         System.out.println("Please create an account first.");
                     } else {
                         System.out.print("Enter deposit amount: ");
                         double dep = sc.nextDouble();
                         account.deposit(dep);
                     }
                     break;

                 case 3:
                     if (account == null) {
                         System.out.println("Please create an account first.");
                     } else {
                         System.out.print("Enter withdrawal amount: ");
                         double with = sc.nextDouble();
                         account.withdraw(with);
                     }
                     break;

                 case 4:
                     if (account == null) {
                         System.out.println("Please create an account first.");
                     } else {
                         System.out.println("Current Balance: ₹" + account.getBalance());
                     }
                     break;

                 case 5:
                     if (account == null) {
                         System.out.println("Please create an account first.");
                     } else {
                         account.displayAccountDetails();
                     }
                     break;

                 case 6:
                     System.out.println("Thank you for using Bank Management System.");
                     break;

                 default:
                     System.out.println("Invalid choice. Try again.");
             }
         } catch (IllegalArgumentException e) {
             System.out.println("Error: " + e.getMessage());
         }

     } while (choice != 6);

     sc.close();
 }
}
