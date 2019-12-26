package day24_Arrays_part1;

import java.util.Scanner;

public class task87_days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] Day = new String [7];
		
Day[0]="Mon";
Day[1]="Tue";
Day[2]="Wed";
Day[3]="Thu";
Day[4]="Fri";
Day[5]="Sat";
Day[6]="Sun";
		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter your day index number:");
		int index=scan.nextInt();
		
		System.out.println("Today is " + Day[index]);
		
	}

}
