package day23_StringManipulationLab_Random;

import java.util.Random;

public class Task84_Macar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r=new Random();
		boolean b;
		for(int a=1;a<=10;a++) {
			b=r.nextBoolean();
			if(b==true) {
				System.out.println("Tails");
			}
			else {
				System.out.println("Heads");
			}
		}
	}

}
