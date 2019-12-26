package day22_StringManupulation_Lab;

public class question8_Ozzy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(left2("Hello"));
		System.out.println(left2("Java"));
		System.out.println(left2("Hi"));
		

	}
	
	public static String left2(String str) {
		
		return str.substring(2).concat(str.substring(0,2));
		
	}




	}


