package day24_Arrays_part1;

import java.util.*;

public class Task88_Cars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		Random rn=new Random();
		
		String[] Car = new String [7];
		
		Car[0]="Honda";
		Car[1]="Toyota";
		Car[2]="Nissan";
		Car[3]="BMW";
		Car[4]="Mercedes";
		Car[5]="Porsche";
		Car[6]="Ferrari";
				
				
				
				Scanner scan=new Scanner(System.in);
				System.out.print("Enter your car index number:");
				int index=scan.nextInt();
				
				if (index==0||index==1||index==2)  {
					System.out.println("Your car is "+Car[index]+", Random price between= "+(rn.nextInt((40000-20000)+1)+20000));
				}else if (index==3||index==4) {
					System.out.println("Your car is "+Car[index]+", Random price between= "+(rn.nextInt((80000-50000)+1)+50000));
				}else if (index==5||index==6) {
					System.out.println("Your car is "+Car[index]+", Random price between= "+(rn.nextInt((150000-100000)+1)+100000));
				}else {
					System.out.println("Please select a car");
				}
				
		
	}

}
