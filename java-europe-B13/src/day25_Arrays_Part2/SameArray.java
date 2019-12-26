package day25_Arrays_Part2;

public class SameArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array1= {2,4,6,8,10};
		int[] array2= array1; 
		
		array1[0]=200;     //hangisine yazarsan yaz ikisine de atama yapar
		array2[4]=1000; 
		
		System.out.println("The contencts of array1:");
		
		for(int value:array1) {
			System.out.println(value);
		}
		
		System.out.println();
		System.out.println("The contencts of array2:");
		
		for(int value:array2) {
			System.out.println(value);
		}
		

	}

}
