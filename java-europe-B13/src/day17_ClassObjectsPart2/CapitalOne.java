package day17_ClassObjectsPart2;

public class CapitalOne {

	public static void main(String[] args) {

		int x=5;
		System.out.println(x);

	BankAccount acc1 = new BankAccount();
		
		acc1.accountHolder = "Mike Smith";
		
		acc1.accountNumber=12345;
		
		acc1.deposit(250);
		
		acc1.showBalance();
		
		acc1.withdraw(100);
		
		acc1.showBalance();
		
		acc1.charge(50, "table");
		
		acc1.showBalance();
		




	}

}