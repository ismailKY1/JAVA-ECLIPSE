package day14_lab_1;

public class question6_Ozzy {

	public static void main(String[] args) {
		
		cigarParty(30, false);
		cigarParty(50, false);
		cigarParty(70, true);


	}
	
	public static void cigarParty(int numberCigar,boolean isWekeend) {
		
		if(isWekeend) {
			if(numberCigar>=40) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}else {
			if(numberCigar>=40 && numberCigar<=60) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
			
		}
	}
}
		
		
		

