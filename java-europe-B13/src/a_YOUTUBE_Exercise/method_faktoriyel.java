package a_YOUTUBE_Exercise;

import java.util.Scanner;

public class method_faktoriyel {

	public static void main (String[] args) {
	
		
		selamlama();      //kc tane method yazarsak o kadar cagiracak
		selamlama();
		selamlama();

		

	}
		public static void selamlama() {

		Scanner scan= new Scanner (System.in);
		
		System.out.println("Sayi giriniz=");
		
		int sayi =scan.nextInt(); 
		int faktoriyel=1;
				 
		while (sayi>0) {
			faktoriyel*=sayi; 
			sayi--; 
					
		}
		
		System.out.println("Faktoriel= "+faktoriyel);
		
		
			
		}
		
}
