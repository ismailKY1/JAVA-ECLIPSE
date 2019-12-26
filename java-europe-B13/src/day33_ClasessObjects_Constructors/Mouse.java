package day33_ClasessObjects_Constructors;

public class Mouse {
	
	
	
	int numTeeth;
	int numWhiskers;
	int weight;
	
	
	public Mouse(int weight) { //1
		this(weight,16); 
		System.out.println("Hello, do u like java?");
	}
	
	public Mouse(int weight,int numTeeth) { //2
		this(weight,numTeeth,6); 
		System.out.println("Hello, who I am ?");
	}
	
	public Mouse(int weight, int numTeeth, int numWhiskers) { //3
		this.numTeeth = numTeeth;
		this.numWhiskers = numWhiskers;
		this.weight = weight; 
		System.out.println("I LOVE constructors");
	}
	
	public void print() {
		System.out.println(weight + " " + numTeeth + " " + numWhiskers);
	}
}
