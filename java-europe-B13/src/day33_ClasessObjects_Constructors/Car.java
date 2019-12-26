package day33_ClasessObjects_Constructors;

public class Car {

	String model; 
	String make;
	int year;
	double mile;
	String color; 
	

	public Car(String model, String make, int year, double mile, String color) {
		super();
		this.model = model;
		this.make = make;
		this.year = year;
		this.mile = mile;
		this.color = color;
	}
}
