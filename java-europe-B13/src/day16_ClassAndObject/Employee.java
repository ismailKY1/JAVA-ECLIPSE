package day16_ClassAndObject;

public class Employee {

	String name;
	String jobTitle;
	double salary;
	
	
	
	public void work() {
		
		if(salary>5000) {
			System.out.println(name  + " is working hard...");
			
		}else if (salary<=5000&&salary>3000) {
			System.out.println(name  + " is working good...");
		}else {
			System.out.println(name  + " can work better.");
		}
		
	}
	
	public void attendMeeting() {
		System.out.println(name + " is attending a meeting...");
	}
	
	public void introduce() {
		System.out.println("Name:" + name + "Job title:" + jobTitle + "Salary:" + salary);
	}
}
