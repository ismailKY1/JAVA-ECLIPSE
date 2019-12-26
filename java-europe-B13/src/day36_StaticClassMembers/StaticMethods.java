package day36_StaticClassMembers;

public class StaticMethods {
	
	static String name= "Apple"; 

	public static void show1() {			//static method 
		System.out.println("hi");
		//show2(); // you can not call instance method from static method (error)
		show4(); // you can call static method from static method 
		System.out.println(name); //String name= "Apple" olursa hata verir onune static koymak lazm
		
	}
	public void show2() { 					//instance method 
		System.out.println("hi");
		show1(); // u can call static from instance method 
	
		
	}
	public void show3() {
		System.out.println("hi");
		show2(); // u can call instance method from instance method
		show1(); //u can call static from instance
		
	
	}
	public static void show4() {
		System.out.println("hi");
	
	}
	
}
