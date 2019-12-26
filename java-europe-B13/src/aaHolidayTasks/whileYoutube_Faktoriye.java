package aaHolidayTasks;

import java.util.Scanner;

public class whileYoutube_Faktoriye {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Sayiyi giriniz:");
		
		int sayi= scan.nextInt();
		int faktoriyel=1;
		//Burada amacimiz faktoriyel olusturmk, yani girilen sayiyinin 0,a kadar olan geri sayiminin carpimi.
		// mesela sayi 5 olsun, 5*4*3*2*1=? bu sonuca ulasmak 
		
		
		while (sayi>1) {
			
			faktoriyel=faktoriyel*sayi;
			System.out.println("Faktoriyel= "+faktoriyel+ ", Sayi= "+sayi);
			
			sayi--;
		}
		System.out.println("Faktoriyel: "+faktoriyel);
		
		
		
	}

}
