package day33_ClasessObjects_Constructors;

public class RectangleTest {

	public static void main(String[] args) {
		
		Rectangle R1= new Rectangle (); 
		//what new keyword does? call the constructor
		//which constructor? constructor with no argument 
		R1.length=20; 
		R1.width=10; 
		R1.getArea();
		
		
		Rectangle R2= new Rectangle (); 
		R2.length=10; 
		R2.width=5; 
		R2.getArea();
		
		Rectangle R6 = new Rectangle(); 
		//what new keyword does? call the constructor 
		//which constructor?
		//constructor with one parameter which is int
		
		Rectangle R5 = new Rectangle(4.2, 3.7);
		Rectangle R3 = new Rectangle(1, 2);
		Rectangle R4 = new Rectangle(5.7, 1.2);
		
		R5.getArea();
		R3.getArea();
		R4.getArea();
		
		
	}

}
