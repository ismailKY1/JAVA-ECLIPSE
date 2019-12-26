package day22_StringManupulation_Lab;

public class question7Ozzy_onemliCheckEt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(comboString("Hello", "Hi"));
		System.out.println(comboString("Hi", "Hello"));
		System.out.println(comboString("b", "aaaa"));
		System.out.println(comboString("l", "oooooooooo"));
	}
	
	public static String comboString(String str1,String str2) {
		
		String str;
		if(str1.length()>str2.length()) {
			str = str2.concat(str1).concat(str2);
		}else {
			str = str1.concat(str2).concat(str1);
		}
		
		return str;
	}
}
