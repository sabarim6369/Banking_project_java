package mybankingapp;

public class CreateSavingsAccount extends CreateAccount{
	private int transactionLimit;
	public CreateSavingsAccount(String customerName, int accountNumber, double initialBalance, int transactionLimit,String accountType) {
		super(customerName, accountNumber, initialBalance, accountType);
		this.transactionLimit=transactionLimit;

		// TODO Auto-generated constructor stub
	}
	public int getTransactionLimit() {
		return this.transactionLimit;
	}
	@Override
	public void displayAccountDetails() {
		super.displayAccountDetails();
		System.out.println("Savings account is created sucessfully");
	}
}
