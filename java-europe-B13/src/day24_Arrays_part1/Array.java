package day24_Arrays_part1;

public class Array {

	public static void main(String[] args) {

		 
//		int[] myList;
//		
//		myList[0]=1;
//		myList[1]=2;
//		myList[2]=3;
//		myList[3]=4;
		
		int[] myList= {1,2,3,4}; 
		String[] myArray= {"apple", "elma", "nr", "muz"};
		
		System.out.println(myList[0]);
		System.out.println(myList[1]);
		System.out.println(myList[2]);
		System.out.println(myList[3]);
		

		System.out.println(myArray[0]);
		System.out.println(myArray[1]);
		System.out.println(myArray[2]);
		System.out.println(myArray[3]);
		
		System.out.println(myList.length);
		
		for(int i=0; i<myList.length; i++) {
			System.out.println(myList[i]);
		}
		
		int [] scores= {80,70,80,78,87,66,5,45,53,23,22,20,30,40,70,80,33};
			int sum=0;
		for (int i=0; i<scores.length; i++) {
			sum=sum+scores[i];
		}
		
		System.out.println("Total is "+sum+" avarage is "+sum/scores.length);
	}

}
