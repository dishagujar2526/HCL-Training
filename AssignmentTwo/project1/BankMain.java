package AssignmentTwo.project1;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		BankService service = new BankService();
		BankAccount account = service.loadAccount();

		try {
			if (account == null) {
				System.out.println("Create Account");
				System.out.print("Account Number: ");
				int accNo = sc.nextInt();
				sc.nextLine();

				System.out.print("Name: ");
				String name = sc.nextLine();

				System.out.print("Initial Balance: ");
				double bal = sc.nextDouble();

				System.out.print("1.Savings 2.Current: ");
				int type = sc.nextInt();

				// Runtime Polymorphism
				if (type == 1)
					account = new SavingsAccount(accNo, name, bal);
				else
					account = new CurrentAccount(accNo, name, bal);

				service.saveAccount(account);
			}

			while (true) {
				System.out.println("\n1.Deposit");
				System.out.println("2.Withdraw");
				System.out.println("3.Balance Enquiry");
				System.out.println("4.Account Details");
				System.out.println("5.Exit");
				System.out.print("Choice: ");

				int choice = sc.nextInt();

				switch (choice) {
				case 1:
					System.out.print("Amount: ");
					account.deposit(sc.nextDouble());
					break;

				case 2:
					System.out.print("Amount: ");
					account.withdraw(sc.nextDouble());
					break;

				case 3:
					System.out.println("Balance: " + account.getBalance());
					break;

				case 4:
					account.displayDetails();
					break;

				case 5:
					service.saveAccount(account);
					System.out.println("Thank you!");
					sc.close();
					return;

				default:
					System.out.println("Invalid choice");
				}
			}
		} catch (Exception e) {
			System.out.println("Invalid input handled.");
		}
	}

}
