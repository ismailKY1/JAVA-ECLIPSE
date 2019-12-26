package day11;

public class nestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1;i<=5;i++) { // true ise print yapar ve alttaki loop.a gecer. alttaki 2.loop false olana kadar kendi icinde doner
												//2. loop false olunca tekrar 1.loop.a doner ve tekrar print+2.loop (ama 2.loop basa alir) 
												// bug modda ayrintili gorebilirsin 
			System.out.println("Outer Loop Iteration " + i);
			
			for(int j=1;j<=2;j++) {
				
				System.out.println("i = " + i + "; j = " + j);
			}
			
		
		}

	}

}
