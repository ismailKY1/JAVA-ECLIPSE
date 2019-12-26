package day22_StringManupulation_Lab;

public class question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(frontAgain("edited"));
		System.out.println(frontAgain("edit"));
		System.out.println(frontAgain("ed"));
		
		
		
		
	}
	  public static String frontAgain(String str) {
	        
	        if(str.substring(0,2).equals(str.substring(str.length()-2))) {
	            
	            str="true";
	            
	            
	        }
	        else {
	            str="false";
	        }
	        
	    return str;
	    
	}

}
