package day19_StringManipulation_part1;

public class String_CharAt {

	public static void main(String[] args) {


		String word= "Computer";
		
		System.out.println(word.length());
		
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
		
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		String word2= "Apple"; //check if first character is 'A'
	        
	        if (word2.charAt(0)=='A') {
	            System.out.println(true);
	        }else {
	            System.out.println(false);
	        }
	        
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
		String d="civic"; // ilk ve son harfler ayni i check edelim.
		boolean e=d.charAt(0)==d.charAt(4);
		System.out.println(e);
		
		
		
	}

}
