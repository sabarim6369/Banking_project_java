package mybankingapp;

public class CreateCurrentAccount extends CreateAccount{

	public CreateCurrentAccount(String customerName, int accountNumber, double initialBalance, String accountType) {
		super(customerName, accountNumber, initialBalance, accountType);
	}
	public void displayCreateAccountDetails() {
		super.displayAccountDetails();
		System.out.println("Current account is created for "+this.customerName);
	}
}
