package day44_exceptions;

public class MultiCatch {

	public static void main(String[] args) {
		
		try {
			System.out.println(4/0);
			
			String str = null; 
			System.out.println(str.toUpperCase());
			
			
			
		}catch(AritmeticException e) {
			
		}

	}

}
