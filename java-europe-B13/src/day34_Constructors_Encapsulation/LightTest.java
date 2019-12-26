package day34_Constructors_Encapsulation;

public class LightTest {

	public static void main(String[] args) {

		System.out.println("Creating Light Object n.1");
		Light l1= new Light(); 
		
		System.out.println("___________________________");
		
		System.out.println("Creating Light Object n.2");
		Light l2= new Light(250,true); 
		
		System.out.println("_____________________________");
		
		System.out.println("Creating Light Object n.3");
		Light l3= new Light(250,true,"attic"); 
		
		
	}

}
