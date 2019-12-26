 package aaHolidayTasks;

import java.util.Scanner;

public class while_dongusu {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);

		
		int bakiye= 1000;
		int islem;
		
		System.out.println("1: Bakiye Goruntule");
		System.out.println("2: Para Yatirma");
		System.out.println("3: Para Cekme");
		System.out.println("4: Sistemden cikis");
		System.out.print("isleminizi secin: ");
		
		islem = scan.nextInt();
		 
		switch (islem) {
			case 1:
				System.out.println("Bakiyeniz= $"+bakiye);
				break;
			case 2: 
				System.out.println("Yatiracaginiz para miktarini giriniz=");
				int miktar= scan.nextInt();
				
				bakiye+=miktar;
				System.out.println("yatirilan miktar= $"+miktar+" Bakiyeniz= $"+bakiye);
				break;
			
			case 3:
				System.out.println("Cekeceginiz para miktarini giriniz=");
				miktar= scan.nextInt();
				bakiye-=miktar;
				System.out.println("cekilen miktar= $"+miktar+" Bakiyeniz= $"+bakiye);
				break;

			case 4:
				System.out.println("Gule gule");
				break;
				
			default:
				System.out.println("Gecersiz islem...");
				break;
				

		
		}
		
		

	}

}
