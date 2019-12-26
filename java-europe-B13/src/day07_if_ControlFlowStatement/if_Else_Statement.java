package day07_if_ControlFlowStatement;

public class if_Else_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int score = 60; 
		
		if (score>=70) {
		
		System.out.println("Excellent");
		System.out.println("You passed with grade A");
		
		}else {
			System.out.println("You Failed...");
		}
		System.out.println("******************************************");
		
		
		
		int sales, bonus; 
		double commisionRate, salary; 
		
		sales =5000; 
		salary=10000; 
		
		if (sales>5000) {
			
			bonus=500;
			commisionRate=1.12; 
				
			}else {
				bonus=100;
				commisionRate=1.02; 
			
			salary= salary*commisionRate+bonus; //sonucu vermesi icin 5000 den buyuk olmali, kucuk olursa sadece 10000 yazar, 
			
		}
		System.out.println("Salary = " + salary);
		
	}

}
