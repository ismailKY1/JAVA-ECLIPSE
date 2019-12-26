package day17_ClassObjectsPart2;

import java.util.Scanner;

public class userInput {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		
		System.out.print("Enter a byte value:");
		
		byte b1= sc.nextByte(); // int b1= sc.nextByte()
				
				System.out.println(b1);
				System.out.println(b1*5);
				System.out.println(b1%3);

		System.out.println("enter another byte value: ");
				
		byte b2 = sc.nextByte();
				
				System.out.print(b2+b2);		
				
	}

}
