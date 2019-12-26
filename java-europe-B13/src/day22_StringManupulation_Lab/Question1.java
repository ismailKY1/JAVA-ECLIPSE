package day22_StringManupulation_Lab;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		String hello= "Hello";
		System.out.println("Write your name :");
		String name= sc.nextLine();;

		hello=hello.concat(" "+name);
		
		System.out.println(hello);
		
	}

}
