package day35_encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee E1 = new Employee(); 
		Employee E2 = new Employee("MIKE SMITH",47899,"Accounting","VP"); 
		Employee E3 = new Employee("Mark Jones",39119,"IT","Developer");
		Employee E4 = new Employee("Tedd Britt",81774,"Sales","Sales Person");
		
		System.out.println(E1.toString());
		System.out.println(E2.toString());
		System.out.println(E3.toString());
		System.out.println(E4.toString());	
		
		

	}

}
