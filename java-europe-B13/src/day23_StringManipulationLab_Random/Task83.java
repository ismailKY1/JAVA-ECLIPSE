package day23_StringManipulationLab_Random;

import java.util.Random;
import java.util.Scanner;

public class Task83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int number1;
		int number2;
		String again= "y";
		
		Scanner sc=new Scanner(System.in);
		Random rn= new Random();
		
		while (again.equalsIgnoreCase("y")) {
			number1= rn.nextInt(6)+1;
			number2= rn.nextInt(6)+1;
			
			System.out.println("Their values are: ");
			System.out.println(+number1+","+number2);
			
			System.out.println("Roll them again (y=yes)?");
			again=sc.nextLine();
			
			
		}
		
	}

}
