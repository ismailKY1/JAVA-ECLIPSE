package day22_StringManupulation_Lab;

public class question3 {

	public static void main(String[] args) {
		
		System.out.println(extraEnd("Hello"));
		System.out.println(extraEnd("ab"));
		System.out.println(extraEnd("Hi"));
		
		
		
		
	}
	
	public static String extraEnd(String str) {
		str = str.substring(str.length()-2);
		
		
		return str+str+str;
		
		
	}

}
