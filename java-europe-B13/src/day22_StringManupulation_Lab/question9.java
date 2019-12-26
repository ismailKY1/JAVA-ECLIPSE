package day22_StringManupulation_Lab;

public class question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(right2("Hello"));
		System.out.println(right2("Java"));
		System.out.println(right2("Hi"));
		
		
		
		
	}
	
	public static String right2(String str) {
		return str.substring(str.length()-2)+str.substring(0, str.length()-2);
			
		
		}
	
		

	}


