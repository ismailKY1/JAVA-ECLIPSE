package day24_Arrays_part1;

public class ArrayCre2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] scores = new int [5]; // 5 sira Array yazabiliriz yani 0-4 arasi
		
		scores[0]=80; 
		scores[1]=85; 
		scores[2]=90; 
		scores[3]=100; 
		scores[4]=50; 
		
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		System.out.println(scores[2]);
		System.out.println(scores[3]);
		System.out.println(scores[4]);
		
		int avgScore2= (scores[0]+scores[1]+scores[2]+scores[3]+scores[4]); 
		System.out.println(avgScore2);
		
	}

}
