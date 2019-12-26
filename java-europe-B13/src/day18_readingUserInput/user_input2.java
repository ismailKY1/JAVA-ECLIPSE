package day18_readingUserInput;

import java.util.Scanner;

public class user_input2 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		System.out.println("provide a sentences and i will repeat it:");
		
		//String str= sc.next(); //sadece "sc.next" yazarsan ilk kelimeyi print eder 
		String str= sc.nextLine(); // nextLine yazarsan input ettigin tum cumleyi print eder
		
		System.out.println(str);
		
		
		

	}

}
