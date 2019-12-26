package day22_StringManupulation_Lab;

public class Question7 {

	public static void main(String[] args) {


		System.out.println(comboString("Hello","Hi"));
		System.out.println(comboString("Hi","Hello"));
		System.out.println(comboString("aaa","b"));
		
		
		
		
	}
	
	public static String comboString(String str1, String str2) {
		
			if (str1.length()>str2.length()) {
			return str2+str1+str2;
			}else if(str2.length()>str1.length()) {
				return str1+str2+str1;
			}
		return"";
	}

}
