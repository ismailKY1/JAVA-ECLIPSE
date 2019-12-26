package day38_Inheritance_Part2;

public class VehicleTest {

	public static void main(String[] args) {
		Car c1=new Car(); 
		c1.display();
		
	}

}

	class Vehicle{
	int maxSpeed=120; 	
}
	class Car extends Vehicle{
		int maxSpeed=180;   		//override the parent variable 
		
		void display() {
			System.out.println("Max Speed = "+maxSpeed);
			System.out.println("Max Speed2 = "+super.maxSpeed);  // super=> go to parent class 
		}
		
	}


