package day36_StaticClassMembers;

public class ABCTest {

	public static void main(String[] args) {

		ABC.m1();   // call method true ONLY static way 
		
		ABC o1=new ABC(); 
		o1.m1();
		

	}

}
