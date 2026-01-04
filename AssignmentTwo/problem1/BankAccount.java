package AssignmentTwo.problem1;

public class BankAccount implements BankOperations, CustomerOperations {

	private int accountNumber;
	private String customerName;
	private double balance;

	public BankAccount(int accountNumber, String customerName, double balance) {
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.balance = balance;
	}

	@Override
	public void deposit(double amount) {
		if (amount <= 0) {
			System.out.println("Deposit amount must be positive.");
			return;
		}
		balance += amount;
		System.out.println("Amount deposited: ₹" + amount);
	}

	@Override
	public void withdraw(double amount) throws InsufficientBalanceException {
		if (amount > balance) {
			throw new InsufficientBalanceException("Insufficient balance for withdrawal.");
		}
		balance -= amount;
		System.out.println("Amount withdrawn: ₹" + amount);
	}

	@Override
	public void checkBalance() {
		System.out.println("Current Balance: ₹" + balance);
	}

	@Override
	public void displayCustomerDetails() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Customer Name: " + customerName);
	}
}
