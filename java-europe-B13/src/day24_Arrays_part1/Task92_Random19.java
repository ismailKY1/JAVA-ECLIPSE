package day24_Arrays_part1;

import java.util.Arrays;

public class Task92_Random19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] number= {1,2,3,4,5,6,7,8,9,10};
		
		
		for (int i=0; i<number.length; i++) {
			System.out.println(number[i]*19);
		}
		
		System.out.println(Arrays.toString(number));  // Array formatinda tum verileri tek satirda cikarir.  
	}

}
