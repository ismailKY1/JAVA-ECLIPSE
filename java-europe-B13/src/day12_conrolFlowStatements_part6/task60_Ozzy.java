package day12_conrolFlowStatements_part6;

public class task60_Ozzy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calculator(6, 3, "+");
		calculator(6, 3, "-");
		calculator(6, 3, "*");
		calculator(6, 3, "/");

	}
	
	public static void calculator(int num1,int num2,String operator) {
		
		switch(operator) {
		case "+":
			System.out.println(num1+num2);
			break;
		case "-":
			System.out.println(num1-num2);
			break;
		case "*":
			System.out.println(num1*num2);
			break;
		case "/":
			System.out.println(num1/num2);
			break;
		}
		
	}
		
	}


