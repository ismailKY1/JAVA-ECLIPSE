package day31_arrayList;

import java.util.ArrayList;

public class containsMethod {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("Jan");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");
		
		System.out.println(list1.toString());
		
		ArrayList<String> list2= list1; // yeni bir liste ama ayni 
		
		//copy all values from list1
		ArrayList<String> months = new ArrayList<String>(list1); 
		
		months.add("Jun");
		months.add("Jul");
		months.add("Agu");
		System.out.println(months);
		
		System.out.println(months.contains("Jan")); //months icinde Jan var mi 
		System.out.println(months.contains("Dec"));
		
		//how to check if Feb is in second position 
		
		System.out.println(months.lastIndexOf("Feb")== 1); //veya
		System.out.println(months.get(1).equals("Feb"));
		
		
		list1.add("Jan");
		System.out.println("List1 ="+list1);
		System.out.println("Month ="+months);
		
		
		if(months.containsAll(list1)) {
			System.out.println("Months has all list1");
		}else {
			System.out.println("Some values are missing");
		}
		

	}

}
