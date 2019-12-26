package day22_StringManupulation_Lab;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(together("Hi","bye"));
		System.out.println(together("Yo","Alice"));
		System.out.println(together("What","Up"));
		

	}
	
	public static String together(String str1, String str2) {
		
		return str1+str2+str2+str1;
		
	}

}
