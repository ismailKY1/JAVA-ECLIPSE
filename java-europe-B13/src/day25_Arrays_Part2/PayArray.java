package day25_Arrays_Part2;

import java.util.Scanner;

public class PayArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] employeHours=new int[5]; 
		
		
		System.out.println("Enter hours each Employes:");
		employeHours[0] = sc.nextInt();
		employeHours[1] = sc.nextInt();
		employeHours[2] = sc.nextInt();
		employeHours[3] = sc.nextInt();
		employeHours[4] = sc.nextInt();
		
		
		
		for(int i=0; i<employeHours.length; i++) {
			System.out.println(employeHours[i]*10);
		}
		
		
		

	}

}
