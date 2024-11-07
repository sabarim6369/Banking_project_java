package mybankingapp;
import java.util.HashMap;
public class Bank {
	private HashMap<Integer,CreateAccount> customers = new HashMap<>();
	public void addCustomer(CreateAccount account) {
		customers.put(account.accountNumber, account);
	}
	public void getBalance(int accountNumber) {
		CreateAccount balance = customers.get(accountNumber);
		System.out.println("balance is "+balance.initialBalance);
	}
	public CreateAccount getCustomer(int accountNumber) {
		return customers.get(accountNumber);
	}
}
