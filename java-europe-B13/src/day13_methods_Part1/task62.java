package day13_methods_Part1;

public class task62 {

	public static void main(String[] args) {
		
		calculateGreates(43,789,89);

		
	}

	public static void calculateGreates(int a, int b, int c) {

		if(a>b&&a>c) {
			System.out.println(a);
		}else if(b>a&&b>c) {
			System.out.println(b);
		}else if(c>b&&c>a) {
			System.out.println(c);
		}
		


	}

}
