package day24_Arrays_part1;

import java.util.Scanner;

public class task87_Days22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] w=new String[7];
		
		w[0]="Monday";
		w[1]="Tuesday";
		w[2]="Wednesday";
		w[3]="Thursday";
		w[4]="Friday";
		w[5]="Saturday";
		w[6]="Sunday";
		
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter day number:");
		int dn=scan.nextInt();
		System.out.println(w[dn-1]);
	}

}
