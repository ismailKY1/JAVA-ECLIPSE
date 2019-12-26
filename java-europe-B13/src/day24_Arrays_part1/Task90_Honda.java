package day24_Arrays_part1;

public class Task90_Honda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] list= {"BMW","Merco","Opel","Toyota","Wv","Honda"};
		
	for (int i=0; i<list.length; i++) {
		if(list[i]=="Honda") {
			System.out.println("I found your car Honda in this array");
			return;
		}else {
			System.out.println("I could not find your car Honda in this array");
		}
	}
	}

}
