package AssignmentTwo.problem1;

public class BankMain {

	public static void main(String[] args) throws InsufficientBalanceException{

		BankAccount account = new BankAccount(101, "Disha Gujar", 5000);

		account.displayCustomerDetails();
		account.checkBalance();

		account.deposit(2000);

		try {
			account.withdraw(8000);
		} catch (InsufficientBalanceException e) {
			System.out.println("Error: " + e.getMessage());
		}

			account.withdraw(3000);
		

		account.checkBalance();
	}
}
