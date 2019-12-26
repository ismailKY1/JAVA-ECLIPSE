package day19_StringManipulation_part1;

public class task78Ozzy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abcabqcabc";
		char myChar = 'a';
		
		int counter=0; 
		
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)==myChar) {
				
				counter++;
			}
			
			
		}
		
		System.out.println("Count for " + myChar + " is " + counter);


		
		
	}

}
