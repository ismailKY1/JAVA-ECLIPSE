package day22_StringManupulation_Lab;

public class question10_Ozzy_Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(frontAgain("edited"));
		
		}
			
			public static boolean frontAgain(String str) {  // boolean ile public acti
				
				String first2 = str.substring(0,2);         //ed
				String last2 = str.substring(str.length()-2);
				
				return first2.equals(last2);
				
				
			}
	

}
