package day07_if_ControlFlowStatement;

public class if_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int score = 80; 
		
		
		if (score>=70) {
		
		System.out.println("Excellent");
		System.out.println("You passed with grade A");
		}
		
		System.out.println("***********************************************");
		
		int sales, bonus; 
		double commisionRate, salary; 
		
		sales =5001; 
		salary=10000; 
		
		if (sales>5000) {
			
			bonus=500;
			commisionRate=1.12; 
			
			salary= salary*commisionRate+bonus; //sonucu vermesi icin 5000 den buyuk olmali, kucuk olursa sadece 10000 yazar, 
			
		}
		System.out.println("Salary = " + salary);
		
	
		
	}

}
