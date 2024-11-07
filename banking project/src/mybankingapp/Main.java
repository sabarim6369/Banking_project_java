package mybankingapp;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
        Scanner s = new Scanner(System.in);
        String customerName;
        int accountNumber;
        double initialBalance;
        String accountType;
        int transactionLimit;
        Bank bankObj = new Bank();
        do {
            System.out.println("\nBanking operation");
            System.out.println("1. Create account: ");
            System.out.println("2. Credit to amount: ");
            System.out.println("3. withdrawal/debit");
            System.out.println("4. view account details");
            
            int choice = s.nextInt();
            s.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Enter name: ");
                    customerName = s.nextLine();
                    
                    System.out.println("Enter account number: ");
                    accountNumber = s.nextInt();
                    s.nextLine(); 
                    
                    System.out.println("Enter initial balance: ");
                    initialBalance = s.nextDouble();
                    s.nextLine(); 
                    
                    System.out.println("Enter account type: ");
                    accountType = s.nextLine();
                    
                    CreateAccount acc1 = null;
                    if (accountType.equalsIgnoreCase("savings")) {
                        System.out.println("Enter transaction limit: ");
                        transactionLimit = s.nextInt();
                        s.nextLine(); 
                        
                        acc1 = new CreateSavingsAccount(customerName, accountNumber, initialBalance, transactionLimit, accountType);
                    } else {
                        acc1 = new CreateCurrentAccount(customerName, accountNumber, initialBalance, accountType);
                    }
                    bankObj.addCustomer(acc1);
                    acc1.displayAccountDetails();
                    break;
                
                    
                case 2:
                	double creditAmount;
                	
                	System.out.println("Enter account number to credit amount: ");
                	accountNumber = s.nextInt();
                	
                	System.out.println("Enter amount to credit: ");
                	creditAmount = s.nextInt();
                	CreateAccount account = bankObj.getCustomer(accountNumber);
                	account.creditToAccount(creditAmount);
                	break;
                	
                case 3:
                	double debitAmount;
                
                	System.out.println("Enter account number to debit from");
                	accountNumber = s.nextInt();
                	
                	System.out.println("Enter amount to debit");
                	debitAmount = s.nextInt();

                	CreateAccount account1= bankObj.getCustomer(accountNumber);
                	account1.debitFromAccount(debitAmount);
                	break;
                	
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (true);
    }
}
