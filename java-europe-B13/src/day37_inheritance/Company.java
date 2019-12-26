package day37_inheritance;

public class Company {

	public static void main(String[] args) {

		Employee emp1=new Employee(); 
		
		emp1.name = "Tom"; 
		emp1.jobTitle = "Teacher"; 
		emp1.age = 27; 
		emp1.gender='M';
				
		emp1.work();
		emp1.toString(); 
		System.out.println(emp1.toString());
		
		emp1.eat("Salad");
		//emp1.attendClass();
		
		

	}

}
