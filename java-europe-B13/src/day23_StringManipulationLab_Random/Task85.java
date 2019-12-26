package day23_StringManipulationLab_Random;

import java.util.Random;

public class Task85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rn=new Random();
		int number1=0;
		int number2=0;
		int computer;
		int user;
		
		for(int i=1;i<=10;i++) {

			computer= rn.nextInt(6)+1;
			System.out.println("Computer value="+computer);
			number1+=computer;
			user= rn.nextInt(6)+1;
			System.out.println("User value="+user);
			number2+=user;
			System.out.println("-----------------------------------------------------------");
			
			}
		System.out.println("Computer total value="+number1);
		System.out.println("User total value="+number2);

		if(number1>number2) {
			System.out.println("Computer wins");
		}else if(number2>number1) {
			System.out.println("User wins");
		}else {
			System.out.println("There is no winner");
		}
	
			
	}

}
