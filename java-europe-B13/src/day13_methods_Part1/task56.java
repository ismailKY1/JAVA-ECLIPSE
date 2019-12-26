package day13_methods_Part1;

public class task56 {


	public static void main(String[] args) {
		
		convertKM();
		convertCM();

	}
	public static void convertCM() {
		int cm=100;
		double mt= cm/100;
		
		System.out.println(mt);
		
	}
	public static void convertKM() {

			int km = 5;
			double miles = km*1.6;
					
			System.out.println(miles);
	}
	}


