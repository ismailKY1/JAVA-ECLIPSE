package day20_StringManipulation_Part2;

public class string_indexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word1="github";
		System.out.println(word1.indexOf("g"));  // basindaki harf kacinci siradaysa onu yazar=0
		System.out.println(word1.indexOf("th")); 
		System.out.println(word1.indexOf("hub")); //3
		
		System.out.println(word1.indexOf("java")); // eger icerikte yoksa -1 print eder
		
		String url= "www.okta.com";
		int i=url.indexOf(".");
		System.out.println("Post of. "+i);
		
		System.out.println(url.charAt(i+1)); // "."dan sonra o harfi geldigi icin 
		
		// find pozition of '-' and check if space is on right and left side
		
		String title= "Java - Google search";
		
		int dash=title.indexOf('-');
		System.out.println(title.charAt(dash-1)); // - onceki space old icin onu cikaracak 
		System.out.println(title.charAt(dash+1));
		System.out.println("Yukarda 2 space var");
		
		String country="United States of America";
		int states= country.indexOf("States");
		System.out.println("Position of states "+states); // states kacinci sirada basliyorsa onu gosterecek
		
		
		String word2= "java, c++, python, tomcat, eclipse";
		//check if c++ is in the word2, 2 cozumu var
		
		//1) contains() ile 
		if (word2.contains("c++")) {					// c++ icinde ise 
			System.out.println("c++ is there");
		}else {
			System.out.println("c++ is not there");
		}
		
		//2) indexOf() ile 
		if (word2.indexOf("c++")>-1) {					// c++ varsa 0 veya pozitif olacagi icin -1 den buyuk olur
	
			System.out.println("c++ is there");
		}else {
			System.out.println("c++ is not there");
		}
		
		
		
		
	}

}
