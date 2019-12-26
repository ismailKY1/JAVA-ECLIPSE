package day28_arrays_Lab;

import java.util.Arrays;

public class question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	int[] x = {1,2,3,6,7};
	
	System.out.println(Arrays.toString(makeLast(x)));
	

}

public static int[] makeLast(int[] arr) {
	
	int[] newArray = new int[2 * arr.length];
	
	newArray[newArray.length-1] = arr[arr.length-1];
	
	return newArray;
	
	
}
}
