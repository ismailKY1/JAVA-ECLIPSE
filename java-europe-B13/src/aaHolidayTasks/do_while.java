package aaHolidayTasks;

import java.util.Scanner;

public class do_while {

	public static void main(String[] args) {
		//girilen sayinin basamaklarindaki rakamlarin sayi degerini toplayan bir dongu yapalim.
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Bir sayi giriniz: ");
		int sayi= scan.nextInt();
		int toplam=0;
		int sayi1=sayi;
		
		
		do {
			toplam+=sayi1%10;
			sayi1=sayi1/10;
	
		}
		while(sayi1>0);
		System.out.println("Girilen sayi; "+sayi+", Rakamlarin toplami:"+toplam);
	}

}
