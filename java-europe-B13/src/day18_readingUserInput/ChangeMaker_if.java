package day18_readingUserInput;

import java.util.Scanner;

public class ChangeMaker_if {

	public static void main(String[] args) {

		//Enter a whole number from 1-99, and I will find a combination of coins that equals that amount of 
		//change
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a number from 1-99:");
		int user_amount=keyboard.nextInt();
		
		if(user_amount>1&&user_amount<100);{
			changeMaker(user_amount);
	
		}else {
			System.out.println("Invalid data");
		}
		
}
	
	public static void changeMaker(int amount) {
	
	int originalAmount=amount;
	
	int quarters=amount/25; //   87/25=3
	amount=amount%25; // 12
	int dimes=amount/10;  // 12/10=1 
	amount=amount%10;     // 2
	int nickles=amount/5;  // 2/5 =0
	amount=amount%5;  
	int pennies=amount;  //2
	
	System.out.println(originalAmount + " cents in coins can be given as:" );
	System.out.println(quarters + " quarters");
	System.out.println(dimes + " dimes");
	System.out.println(nickles + " nickles");
	System.out.println(pennies + " pennies");


	}

}
