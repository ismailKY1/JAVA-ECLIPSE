package a_YOUTUBE_Exercise;

import java.util.Scanner;

public class break_Continue {

	public static void main(String[] args) {


		while (true) {
			Scanner scan= new Scanner(System.in);
			String s;
			
			System.out.println("Bir karakter giriniz= ");
			s= scan.nextLine();
			
			if (s.equals("A")) {
				System.out.println("Dogru Karakter...");
				break; 
			}
			
		}
	
		

	}

}
