package day18_readingUserInput;

import java.util.Scanner;

public class ChangeMaker {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter a whole number from 1-99=");
		int num1=scan.nextInt();
		
		int quarter = num1/25;
		num1-=(quarter*25);
		int dimes= num1/10;
		num1-=(dimes*10);
		int nickles= num1/5;
		num1-=nickles*5;
		int pennies=num1; 
		System.out.println(quarter+" quarters ,"+dimes+" dimes ,"+nickles+" nickles ,"+pennies+" pennies.");
		
			
		
	}

}
