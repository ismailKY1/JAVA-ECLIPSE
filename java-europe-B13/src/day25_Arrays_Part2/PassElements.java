package day25_Arrays_Part2;

public class PassElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []numbers = {5,10,15,20,50,30};
		
		for (int value: numbers) {
			shawValue(value);			// called method 
		}
		
		
		

	}

	private static void shawValue(int n) {
		System.out.print(n+" ");
		
	}

}
