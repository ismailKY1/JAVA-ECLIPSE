package day31_arrayList;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {

		//WE DO THIS EX=
		//-Languages
		//-Print size ArrayList
		//-read couple of Elements
		
		ArrayList<String> Languages = new ArrayList<>(); 
		
		Languages.add("Java"); 
		Languages.add("Turkish");
		Languages.add("English");
		Languages.add("Deutch");
		
		System.out.println("Number of values "+Languages.size());
		System.out.println(Languages.toString());
		
		Languages.add("Russian"); 			//rusca ekledik
		System.out.println(Languages.toString());;
		
		Languages.remove(0); 				//ilk siradakini yani Java silindi
		System.out.println(Languages.toString());
		
		
		

	}

}
