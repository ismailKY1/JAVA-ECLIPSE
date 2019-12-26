package day14_lab_1;

public class question2 {

	public static void main(String[] args) {

		love6(5,5);


	}

	public static void love6(int a,int b) {

		
		if(a==6||b==6) {
			System.out.println("true");
			
		}else if (a+b==6) {
			System.out.println("true");	
			
		}else if (a-b==6) {
			System.out.println("true");
			
		}else 
			System.out.println("false");
		
	}

}
