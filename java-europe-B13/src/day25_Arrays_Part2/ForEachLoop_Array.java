package day25_Arrays_Part2;

public class ForEachLoop_Array {

	public static void main(String[] args) {

		String[] products= {"Timberland","Shirt","Watch","bag","Shoes"};
		
		double[] prices= {120,12.99, 300, 25, 67.89};
		
		for(int i=0;i<products.length;i++) {
			System.out.println(products[i]);
		}
		System.out.println("______________________________________________________________");
		
		for(String prod:products) {
			System.out.println(prod);
		}
		System.out.println("______________________________________________________________");
		
 		for(double pr:prices) {
 			System.out.println(pr);
 		}
 		System.out.println("______________________________________________________________");
 		// print products in reverse order 
 		
 		for(int i=products.length-1; i>=0;i--) {
 			System.out.println(products[i]);
 		}
 		
 		
 		
 		
	}

}
