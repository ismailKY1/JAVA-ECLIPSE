package day19_StringManipulation_part1;

public class Task76 {

	public static void main(String[] args) {


		String str ="Cybertek School";
		
		int length= str.length();
		
		for (int i=0; i <length; i++) {
			
			if (str.charAt(i)!=' ')
				
				System.out.println(str.charAt(i));
			else 
				continue;
		}
	}

}
