package mybankingapp;

public class CreateAccount {
	protected String customerName;
	protected int accountNumber;
	protected double initialBalance;
	protected String accountType;
public CreateAccount(String customerName,int accountNumber,double initialBalance,String accountType){
	this.customerName=customerName;
	this.accountNumber=accountNumber;
	this.initialBalance =initialBalance;
	this.accountType=accountType;
}
public int getAccountNumber() {
	return this.accountNumber;
}
public double getBalance() {
	return this.getBalance();
}
public String getCustomercustomerName() {
	return this.customerName;
}
public void displayAccountDetails() {
	System.out.println("Account created sucessfully for "+this.customerName);
}
public void creditToAccount(double amount) {
	this.initialBalance += amount;
	System.out.println("Amount credited sucessfully your balance is"+this.initialBalance);
}
public void debitFromAccount(double amount) {
	this.initialBalance -= amount;
	System.out.println("Amount withdrawal sucessfully your balance is"+this.initialBalance);
}
}
