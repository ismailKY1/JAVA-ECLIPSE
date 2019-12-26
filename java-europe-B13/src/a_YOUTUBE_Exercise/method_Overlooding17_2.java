package a_YOUTUBE_Exercise;

public class method_Overlooding17_2 {

	public static void main(String[] args) {
		
		skorHesapla("murat", 3000);
		skorHesapla(2500);
		skorHesapla("Ahmet"); 

	}
	public static void skorHesapla(String name, int score) {
		System.out.println(name+" isimli oyuncunun puani= "+score);
	}
	public static void skorHesapla(int score) {
		System.out.println("isimsiz oyuncunun puani= "+score);
	}
	public static void skorHesapla(String name) {
		System.out.println(name+" isimli oyuncunun puani= 0");
	}
}
