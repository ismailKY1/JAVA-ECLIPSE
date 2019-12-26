package aaHolidayTasks;

public class task53_while {

	public static void main(String[] args) {
		// Write a program using while loop, that calculates the sum of the even numbers between 0 and 100
		
		int num=100; 
		int total=0;
		
		while (num>0) {
		total+=num;
		System.out.print(num+",");
		
		num-=2;
		}
		System.out.println();
		System.out.println(total);
	}

}
