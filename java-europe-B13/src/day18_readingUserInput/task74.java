package day18_readingUserInput;

import java.util.Scanner;

public class task74 {

	public static void main(String[] args) {

		int userInput;
		int totalNumber=0;
		
		Scanner sc = new Scanner (System.in);
		
		
		do {
			System.out.print("Enter a number=");
			
			userInput=sc.nextInt();
			
			if(userInput<0) {
				break;

			}else {
				totalNumber+=userInput;
			}
			
		}while(true);
		System.out.println("Total is: "+totalNumber);

	}

}
