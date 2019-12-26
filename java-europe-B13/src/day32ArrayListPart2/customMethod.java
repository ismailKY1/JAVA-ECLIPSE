package day32ArrayListPart2;

import java.util.ArrayList;
import java.util.Random;

public class customMethod {

	public static void main(String[] args) {

		ArrayList<Integer> numList = new ArrayList<>();
		
		numList.add(10);
		numList.add(10);
		numList.add(7);
		numList.add(8);
		numList.add(8);
		numList.add(3);
		numList.add(4);
		numList.add(8);
		
		printList(numList); 
		
		ArrayList<Double> doubleList = new ArrayList<>();
		
		doubleList.add(10.33);
		doubleList.add(1.33);
		doubleList.add(2.33);
		doubleList.add(5.33);
		doubleList.add(7.33);
		
		double sum= sumList(doubleList); // burada bir method cagiriyoruz ama method return ile dondugunde double oluyor. 
		System.out.println(Math.round(sum));  //Math.raund kesirli sayinin sadece tam sayi kismini gosterir
		
		
		ArrayList<Integer> list = getList(15);  // yani burada method olusturmus oluyoruz. ArrayList old icin Method.da ona gore oluyor. 
		System.out.println(list.toString()); //

		
		ArrayList<Integer> rlist = getRandomList(20); // rastgele 20 sayi method icerisinde. 
		System.out.println(rlist.toString());
		
		
		ArrayList<String> strnums= new ArrayList<>(); 
		strnums.add("123");
		strnums.add("33");
		strnums.add("12");
		
		
		ArrayList<Integer> converted = convertToIntList(strnums);  // yukardaki strnums bir String ArrayList, biz bunu Method icerisinde Integer olarak ceviriyoruz 
		System.out.println(converted);
		
		
	}


public static void printList(ArrayList<Integer> nums) {

	for(Integer n: nums)
	System.out.print(n+" ");
}

public static double sumList(ArrayList<Double> dlist) {
	
	double sum = 0; 
	for(Double a: dlist)
		sum= sum+a; 
	
	return sum;

	
}



	public static ArrayList<Integer> getList(int size) {
		
		ArrayList<Integer> newList = new ArrayList<>(); 
		
			for (int i=0; i<size; i++) {
				newList.add(i); 
			}
		return newList;
		
	}

	public static ArrayList<Integer> getRandomList(int size) {
		
		Random r = new Random();
		
		ArrayList<Integer> randomNums = new ArrayList<>(); 
		
			for (int i=1; i<=size; i++) {
				randomNums.add(r.nextInt(101)); //0-100 arasi rastgele 20 sayi olacak 
			}
		return randomNums;
		
	}



	public static ArrayList<Integer> convertToIntList(ArrayList<String> strList) {
		
		ArrayList<Integer> newList = new ArrayList<>(); 
		
			for (String str : strList) {
				
				newList.add(Integer.parseInt(str)); 
			}
		return newList;
	}
}
