package day20_StringManipulation_Part2;

public class String_replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "Moscow is a capital of Russia to Russia"; 
		
		str= str.replace("Moscow", "Baku").replace("Russia", "Azerbaijan").replace("capital", "city");
		  
		System.out.println(str);  // istedigin kadar ayni line ile degistirilebili, ayni kelimeden birden fazla ise hepsini degistirir.
		
		String email= "firstname@gmail.com";
		
		
		
	}

}
