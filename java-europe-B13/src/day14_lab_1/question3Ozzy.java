package day14_lab_1;

public class question3Ozzy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		specialEleven(22);
		specialEleven(23); 
		specialEleven(24);
		specialEleven(3);
		
		
	}
	
	public static void specialEleven(int number) {
		
		if(number%11==0 || (number-1)%11==0 || number%11==1) {
			System.out.println(true);
			
		}else {
			System.out.println(false);
			
		}
		
	}
	}


