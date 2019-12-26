package day34_Constructors_Encapsulation;

public class AppleTest {

	public static void main(String[] args) {

		Apple a1=new Apple();
		System.out.println(a1.color); //class icindeki color parametresini cagirdik //red
		
		changeApple(a1); 
		System.out.println(a1.color);
		
	}
	
	public static void changeApple(Apple b1) {
		b1.color="Orange"; 
	} 
	
		
		

	}


