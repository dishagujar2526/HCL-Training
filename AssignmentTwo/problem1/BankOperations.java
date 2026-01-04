package AssignmentTwo.problem1;

public interface BankOperations {
	void deposit(double amount);

	void withdraw(double amount) throws InsufficientBalanceException;

	void checkBalance();
}
