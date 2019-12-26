package day18_readingUserInput;

import java.util.Scanner;

public abstract class ChangeMakerOzzy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a number from 1-99:");
		int amount=keyboard.nextInt();
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
