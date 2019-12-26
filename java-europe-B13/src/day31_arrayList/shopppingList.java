package day31_arrayList;

import java.util.ArrayList;

public class shopppingList {

	public static void main(String[] args) {
		
		ArrayList<String> shoppingList = new ArrayList<>();
		
		shoppingList.add("paper towel");
		shoppingList.add("dish soap");
		shoppingList.add("trash bag");
		shoppingList.add("clorox");
		shoppingList.add("gloves");
		shoppingList.add("shovel");
		
		//print numbers of items
		int count = shoppingList.size();
		System.out.println(count);
		
		System.out.println("_______________________________________________________");
		//print all items in single line
		System.out.println(shoppingList.toString());
		
		System.out.println("_______________________________________________________");
		//Print first and last item in single line
		System.out.println(shoppingList.get(0) + "|" + shoppingList.get(count-1));
		
		System.out.println("_______________________________________________________");
		shoppingList.remove("paper towel");
		shoppingList.remove("shovel");
		
		System.out.println(shoppingList.toString());
		System.out.println(shoppingList.get(0));
		
		shoppingList.remove(0);
		System.out.println(shoppingList.toString());
		
		System.out.println("_______________________________________________________");
		//print each item
		for(String item : shoppingList) {
			System.out.println(item);
		}
		
		System.out.println("_______________________________________________________");
		//remove all items at once
		shoppingList.clear();
		System.out.println(shoppingList.toString());
	}

}
