package day25_Arrays_Part2;

import java.util.Scanner;

public class PassArray {

	public static void main(String[] args) {
		
		
		int[] numbers = new int [4]; 
		
		//pass the array to the getvalues Method
		
		getValues(numbers); 
		
		System.out.println("Here are the numbers that you entered");

		// pass the array to showArray method
		showArray(numbers); 	
		

	}

	private static void getValues(int[] array) {   //array burda numbers yerine gecti, number da yazabilirdik, ne yazarsak numbers yerine java onu atar. 
													// bu method ile create to array yaptik.. 
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a serious of "+array.length+" numbers");
		
		for(int i=0; i<array.length; i++) {
			System.out.println("Enter number "+(i+1)+" :");
			array[i]=sc.nextInt();                            // girdigmiz veriler array olarak ataniyor
			
		}
		
	}
	private static void showArray(int[] array) {
		
		for(int value: array) {
			System.out.println(value);
		}
		
		
	}


}
