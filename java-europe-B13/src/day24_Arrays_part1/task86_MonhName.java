package day24_Arrays_part1;

import java.util.Scanner;

public class task86_MonhName {

	public static void main(String[] args) {
		
		String[] MonthName = new String [12];
		
		MonthName[0]="January";
		MonthName[1]="February";
		MonthName[2]="March";
		MonthName[3]="April";
		MonthName[4]="May";
		MonthName[5]="June";
		MonthName[6]="July";
		MonthName[7]="August";
		MonthName[8]="September";
		MonthName[9]="October";
		MonthName[10]="November";
		MonthName[11]="December";
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter your month index number:");
		int index=scan.nextInt();
		
		System.out.println("The month is " + MonthName[index]);
		
	}

}
