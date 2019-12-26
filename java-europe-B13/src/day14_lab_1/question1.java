package day14_lab_1;

public class question1 {

	public static void main(String[] args) {
		
		stringTimes("Hi", 4);
		
	}
	
	public static void stringTimes(String string,int number) {
		
		String str = "";
		
		for(int i=0;i<number;i++) {
			
			str = str + string;   
			
		}
		System.out.println(str);
		
	}
		

	}


