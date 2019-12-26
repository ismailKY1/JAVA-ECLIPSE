package day31_arrayList;

import java.util.ArrayList;

public class removeInteger {

	public static void main(String[] args) {

		
		ArrayList<Integer> nums = new ArrayList<>(); 
		
		System.out.println(nums.size());
		
		System.out.println(nums.isEmpty());  // dogru mu yanlis mi
		System.out.println(nums.size()==0);  // dogru mu yanlis mi
		
		nums.add(4); 
		nums.add(1); 
		nums.add(44); 
		nums.add(5); 
		nums.add(10); 
		nums.add(100); 
		nums.add(55); 
		
		System.out.println(nums.toString());
		
		nums.remove(5);  //5. value sildik yani 100
		System.out.println(nums.toString());
		
		Integer n1 = new Integer(5);  //Converting primitive to Object
		Integer n2 = Integer.valueOf(5);
		
		nums.remove(n1);  //removes the specifiied element from the list
		
		System.out.println(nums.toString());
		
		nums.remove(new Integer(4));
		
		System.out.println(nums.toString());
		
		
		
		
	}

}
