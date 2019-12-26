package day25_Arrays_Part2;

public class ReturnArray {

	public static void main(String[] args) {

		// once methodu yaptik sonra ilk satirlardaki verileri yazdik 
		
		double [] values; 
		
		values = getArray();
		
		for(double num : values) {
			System.out.println(num+" ");
		}
		

	}
	
	public static double[] getArray() {
		double [] array = {1.2,2.3,4.4,5.6}; 
		return array; 
		
	}

}
