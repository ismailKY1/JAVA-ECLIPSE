package day24_Arrays_part1;

public class task90_Ozzy {

	public static void main(String[] args) {
		
		String [] list= {"BMW","Merco","Opel","Honda","Toyota","Wv"};
		
		boolean flag= false; //dummy kullandik 
		
		for (int i=0; i<list.length; i++) {
			if (list[i].equals("Honda")) {
				flag=true;
				break;
			}
		
			
		}
		if(flag) {
			System.out.println("found it");
			
		}else {
			System.out.println("Not found");
		}
	}

}
