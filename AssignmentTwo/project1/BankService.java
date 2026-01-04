package AssignmentTwo.project1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BankService {

	private static final String FILE_NAME = "accounts.dat";

	// Method Overloading
	public void saveAccount(BankAccount account) {
		saveAccount(account, FILE_NAME);
	}

	public void saveAccount(BankAccount account, String fileName) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
			oos.writeObject(account);
		} catch (IOException e) {
			System.out.println("Error saving account.");
		}
	}

	public BankAccount loadAccount() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
			return (BankAccount) ois.readObject();
		} catch (Exception e) {
			return null;
		}
	}

}
