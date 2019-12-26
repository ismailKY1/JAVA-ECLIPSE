package day34_Constructors_Encapsulation;

public class Light {

	
	int noOfWatts; 
	boolean indicator; 
	String location;
	
	public Light() {  //bu default constructors degil, bu no argument constructors
		this (0, false);
		System.out.println("Returning from no argument constructor n.1");
	
	}

	public Light(int watt, boolean ind) {
		this(watt, ind,"X"); 
		System.out.println("Returning from constructor no.2");
	}
	
	
	public Light(int noOfWatts, boolean indicator, String location) {
		this.noOfWatts = noOfWatts;
		this.indicator = indicator;
		this.location = location;
		System.out.println("Returning from constructor no.3");
	} 
	
}
