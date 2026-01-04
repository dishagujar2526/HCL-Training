package AssignmentTwo.project1;

public class SavingsAccount extends BankAccount {

	public SavingsAccount(int accNo, String name, double balance) {
		super(accNo, name, balance);
	}

	// Method overriding
	@Override
	public void withdraw(double amount) {
		if (balance - amount >= 1000) {
			balance -= amount;
			System.out.println("Withdrawal successful.");
		} else {
			System.out.println("Minimum balance of 1000 required.");
		}
	}

}
