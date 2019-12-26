package day18_readingUserInput;

import java.util.Scanner;

public class user_input3 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter first number=");
		int num1=sc.nextInt();
		
		System.out.println("enter second number=");
		int num2=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("enter a string");
		String str=sc.nextLine();
		

		System.out.println("Output :" +num1+" "+num2+str);		
		
	}

}
