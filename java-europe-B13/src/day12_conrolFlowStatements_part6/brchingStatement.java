package day12_conrolFlowStatements_part6;

public class brchingStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=0; 
		
		while (number<15) {
			
			number++;
			
			if(number<=5) {
				
				System.out.println("Skipping Number "+number);
				
				continue; 
			}
			System.out.println("number=" + number);
			
			if(number>=10) {
				System.out.println("Breaking at "+ number);
				break;
			}
		}
		
		
		
		
		
		
	}

}
