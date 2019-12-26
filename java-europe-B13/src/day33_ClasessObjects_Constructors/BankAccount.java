package day33_ClasessObjects_Constructors;

public class BankAccount {

	double balance; 
	
	//this constructor sets the starting balance at 0.0
	public BankAccount() {
		balance=0.0; 
		
	}
	
	//this constructor sets the starting balanceto the value passes as an argument 
	public BankAccount(double startBalance) {
		balance=startBalance; 
		
	}
	
	//this constructor sets the starting balance to the value in the String argument
	public BankAccount(String str) {
		balance=Double.parseDouble(str); 
		
	}
	
	//deposit method makes a deposit into account 
	public void deposit (double amount) {
		balance=balance+amount; 
	}
	
	//deposit method makes a deposit into ccount
	public void deposit(String str) {
		balance=balance+Double.parseDouble(str); 
	}
	
	//getBalance
	public double getBalance() {
		return balance;
	}
	
}



