package AssignmentTwo.project1;

public class CurrentAccount extends BankAccount {

	public CurrentAccount(int accNo, String name, double balance) {
		super(accNo, name, balance);
	}

	@Override
	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println("Withdrawal successful.");
		} else {
			System.out.println("Insufficient balance.");
		}
	}

}
