package day43_polymorphism;

public class TestMethod {

	public static void main(String[] args) {
	
		ChildA chA=new ChildA(); 
		chA.m1();
		chA.m2();
		chA.m3();
		
		ChildB chB=new ChildB(); 
		chB.m1();
		chB.m2();
		//chB.m3(); //Hata verir, cunku sadece ChildA() icinde 
		chB.m4();
		
		Parent p1 = new ChildA(); //poliformisim because "Reference type decides what is accessible"
		p1.m1();
		// p1.m2(); //ERROR sadece parent class daki methodu alir 
		
		Parent p2 = new ChildB();
		p1.m1();
		
		MyInterface int1= new ChildA();
		int1.m2();
		
		MyInterface int2=new ChildB(); 
		int2.m2();
		

	}
}

	class Parent{
		public void m1() {}
	}

	interface MyInterface{
		public abstract void m2();
	}

	class ChildA extends Parent implements MyInterface{
		public void m2() {};
		public void m3() {};
	}

	class ChildB extends Parent implements MyInterface{
		public void m2() {}
		public void m4() {}
	}


