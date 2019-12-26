package day22_StringManupulation_Lab;

public class question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println(withoutEnd("Hello"));
		System.out.println(withoutEnd("Java"));
		System.out.println(withoutEnd("adgko"));
		
		
		
		
	}
	
	public static String withoutEnd(String str) {
			str = str.substring(1,(str.length()-1));
			return str;
			
		
		}
	
		

}

	

