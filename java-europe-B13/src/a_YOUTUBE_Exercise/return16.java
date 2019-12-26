package a_YOUTUBE_Exercise;

public class return16 {

	public static void main(String[] args) {
		
			
		System.out.println("Sonuc= "+ minesfour(plustwo(multthree(5))));
	}

	public static int multthree(int i) {

		System.out.println(i+", 3 ile Carpilacak ");
		return i*3;		
	}

	public static int plustwo(int i) {

		System.out.println(i+", 2 Toplanacak ");
		return i+2;		
	}
	public static int minesfour(int i) {

		System.out.println(i+", 4 Cikarilacak ");
		return i-4;		
	}
}
