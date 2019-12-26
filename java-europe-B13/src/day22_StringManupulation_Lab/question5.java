package day22_StringManupulation_Lab;

public class question5 {

	public static void main(String[] args) {

		
		System.out.println(firstHalf("WooHoo"));
		System.out.println(firstHalf("HelloThere"));
		System.out.println(firstHalf("abcdef"));
		
		
		
		
	}
	
	public static String firstHalf(String str) {
		str = str.substring(0,(str.length()/2));
		
		
		return str;
		

	}

}
