package day23_StringManipulationLab_Random;

import java.util.*;
import java.util.Scanner;

public class assignment5_Random {

	public static void main(String[] args) {
		
		int enterMoney, number1,number2,number3;
		String Kiraz, Portakal, Erik, Çan, Kavun, Çubuk;
		
		Scanner sc=new Scanner(System.in);
		Random rn= new Random();
		
		System.out.println("Enter Money= ");
		enterMoney= sc.nextInt(); 

		
		number1= rn.nextInt(6);
		number2= rn.nextInt(6);
		number3= rn.nextInt(6);
		
		switch (number1) {
		case 0:
			System.out.print("Kiraz/");
			break;
		case 1:
			System.out.print("Portakal/");
		break;
		case 2:
			System.out.print("Erik/");
			break;
		case 3:
			System.out.print("Çan/");
			break;
		case 4:
			System.out.print("Kavun/");
		break;
		case 5:
			System.out.print("Çubuk/");
			break;
		default:
			System.out.print("Wrong");
			
		}
		switch (number2) {
		case 0:
			System.out.print("Kiraz/");
			break;
		case 1:
			System.out.print("Portakal/");
			break;
		case 2:
			System.out.print("Erik/");
			break;
		case 3:
			System.out.print("Çan/");
			break;
		case 4:
			System.out.print("Kavun/");
			break;
		case 5:
			System.out.print("Çubuk/");
			break;
		default:
			System.out.print("Wrong");
			
		}	
		switch (number3) {
		case 0:
			System.out.println("Kiraz");
			break;
		case 1:
			System.out.println("Portakal");
			break;
		case 2:
			System.out.println("Erik");
			break;
		case 3:
			System.out.println("Çan");
			break;
		case 4:
			System.out.println("Kavun");
			break;
		case 5:
			System.out.println("Çubuk");
			break;
		default:
			System.out.println("Wrong");
			
		
		if (number1!=number2&&number1!=number3&&number2!=number3) {
			System.out.println("You lost...");
		}else if (number1==number2&&number1==number3&&number2==number3){
			System.out.println("Congratulation !!! You Win $"+(enterMoney*3));
		}else if(number1==number2||number1==number3||number2==number3) {
			System.out.println("Congratulation !!! You Win $"+(enterMoney*2));
		}else {
			System.out.println("pls try again...");
		}
	
		}
	}

}
