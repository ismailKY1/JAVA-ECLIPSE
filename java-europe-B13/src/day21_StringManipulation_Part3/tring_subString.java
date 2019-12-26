package day21_StringManipulation_Part3;

public class tring_subString {

	public static void main(String[] args) {

		String sentence="Java String Manipulation is fun";
		
		System.out.println(sentence.substring(2));
		System.out.println(sentence.substring(5, 11));
		System.out.println(sentence.length()); // bosluklsr dahil rakam sayisi
		System.out.println(sentence.substring(5, sentence.length()-5)); // sondaki 5 tanesini siliyor.
		
		String chars="{{}}";
		String word= "AUTOMATION";
		
//		System.out.print(chars.substring(0,2));
//		System.out.print(word);
//		System.out.println(chars.substring(2));
		
		String result=chars.substring(0, 2)+word+chars.substring(2);
		System.out.println(result);
		
		
		String str= " 342 ";
		System.out.println("|"+str.trim()+"|");
	}

}
