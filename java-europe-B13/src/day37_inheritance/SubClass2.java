package day37_inheritance;

public class SubClass2 extends SuperClass2 {
	
	public SubClass2() {
		super(10);    // java argumant olmayanini default olarak koyuyor, ama gorunmuyor, dolsyisiyla SuperClass2 default constr da print ediyor
		System.out.println("This is the SubClass constructor");
	}

}
