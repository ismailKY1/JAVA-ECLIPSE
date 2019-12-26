package day19_StringManipulation_part1;

public class String_Contains {

	public static void main(String[] args) {
		
		String email= "test@gmail.com";
		
		System.out.println(email.contains("@"));
		
		
		String list= "domates,patetes biber patlican yumurta et elma ";
		System.out.println(email.contains("es"));
		
		if(list.contains("elma")) {
			System.out.println("Elma are in your list");
		}else {
			System.out.println("Elma yok");
		}
		
		boolean hasYumurta=list.contains("yumurta");
		System.out.println("Contains eggs: "+hasYumurta);
		
		boolean hasKabak=list.contains("kabak");
		System.out.println("Contains kabak: "+hasKabak);
		
		if(email.contains("@yahoo")) {
			System.out.println("Yahoo account");
		}else if(email.contains("@gmail")) {
			System.out.println("Gmail account");
		}else if(email.contains("@hotmail")) {
			System.out.println("Hotmail account");
		}
		
		String etsyTitle = "Car | Etsy";
		if(etsyTitle.contains(" | ")) {
			System.out.println("Pipe is there as expected");
		}else {
			System.out.println("Pipe is not detected");
		}
	}

}
