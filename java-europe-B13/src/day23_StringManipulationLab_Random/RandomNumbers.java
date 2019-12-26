package day23_StringManipulationLab_Random;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {


		Random rn =new Random();
		
		System.out.println(rn.nextInt());
		System.out.println(rn.nextDouble());
		System.out.println(rn.nextFloat());
		System.out.println(rn.nextBoolean());
		
		System.out.println(rn.nextInt(50)); // 0 ile 49 arasi rastgele sayi verir. 
		System.out.println(rn.nextInt(10)); // 0 ile 9 arasi 
		
		System.out.println(rn.nextInt(10)+5); //5 ile 14 arasi rastgele sayi
		
		
	}

}
