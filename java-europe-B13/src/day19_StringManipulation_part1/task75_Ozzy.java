package day19_StringManipulation_part1;

import java.util.Scanner;

public class task75_Ozzy {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter firstname");
		String firstname= sc.next();
		
		System.out.println("Enter lastname");
		String lastname= sc.next();		

		System.out.println("Your firstname and lastname characters total is ="+(firstname.length()+lastname.length()));
	}

}
