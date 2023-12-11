/*
 * Assignment-2. Write a Java program that allows the user to create a bank account and perform transactions such as deposit, withdrawal, and balance inquiry.
 Using a conditional operator (ternary operator ), display the message whether minimumbalanceis maintained or not. Steps:
● Create a class BankAccount
● Add three member variables: String accountHolderName , int accountNumber
and int balance;
● Add a constructors using all three members
● Add getters and setters. 
● Add method deposit (int), withdraw(int)
● Implement the methods by increasing or decreasing the balance
● In the main method create a bank account
● Withdraw money from this account and/or deposit into this account
● Get the balance
● Create a string variable “status” inside the main method
● Assign values to status as “Minimum Balance Maintained” if balance is aboveor
equal to 5000. Otherwise values of status will be “Minimum Balance not
Maintained”. Use conditional operator (ternary operator ) to assign the valuesof
the status. ● Display the status.
 */

package lab_04_Operators; //Package Declaration

public class BankAccount { // Class Declaration

	String accountHolderName; // Data members
	int accountNumber, balance;

	public BankAccount(String accountHolderName, int accountNumber, int balance)
	// Constructor with arguments
	{
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	// Getter and Setter Methods
	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	// Deposit Method
	public String deposit(int deposit) {
		balance = balance + deposit;
		return (balance >= 5000 ? "Minimum Balance is Maintained" : "Minimum Balance is not Maintained");

	}

	// Withdraw Method
	public String withdraw(int withdraw) {
		if (withdraw <= balance)
			balance = balance - withdraw;
		else
			System.out.println("Insufficient balance");

		return (balance >= 5000 ? "Minimum Balance is Maintained" : "Minimum Balance is not Maintained");
	}

	public static void main(String[] args) // Main Method
	{

		BankAccount bank = new BankAccount("Nita", 123456789, 11000);
		// Object with Arguments

		System.out.println("Account Holder Name : " + bank.getAccountHolderName());
		System.out.println("Account No : " + bank.getAccountNumber());
		System.out.println("Current Balance : " + bank.balance);

		String msg = bank.deposit(4000);
		System.out.println(msg);
		System.out.println("Balance after Deposit : " + bank.getBalance());
		msg = bank.withdraw(7000);
		System.out.println(msg);
		System.out.println("Balance after Withdraw : " + bank.getBalance());

	}

}