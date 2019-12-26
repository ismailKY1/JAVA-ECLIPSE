package day22_StringManupulation_Lab;

public class qiestion11 {

	public static void main(String[] args) {


		System.out.println(frontAgain("edited"));

	}
	public static String frontAgain(String str) {
		
		if(str.length()>5) {
			System.out.println("okey");
			
		}else if(str.length()<=5) {
			System.out.println("No");
			
		}else {
			System.out.println("Yes");
		}
		return str;
	}
	 
	
	
	
}
