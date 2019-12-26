package day19_StringManipulation_part1;

public class String_Concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String word= "Java";
		
		System.out.println(word.concat("+selenium"));
		System.out.println(word.concat(" in eclipse"));
		
		System.out.println(word);
		
		word=word.concat("+Eclipse");
		System.out.println(word);
		
		word=word.concat(" Automation");
		System.out.println(word);
		
		//word=word.concat(123);// concat method oldugu icin rakam yazamazsin sadece string yazilabilir
		word=word+123;  // bunu yapabilirsin
		System.out.println(word);
		
		word=word+true; 
		System.out.println(word);
		
		String word2= "Hi";
		word2=word2.concat(" Hey").concat(" How are you").concat(" good");
		System.out.println(word2);
		
	}

}
