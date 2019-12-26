package day23_StringManipulationLab_Random;

import java.util.Random;

public class Task84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rn=new Random();
		
		
		for(int i=1;i<=10;i++) {
			
			if (rn.nextInt(2)==0) { 
				System.out.println("Tails");
			}else {
				System.out.println("Heads");
			}
			
			
		}
	}

}
