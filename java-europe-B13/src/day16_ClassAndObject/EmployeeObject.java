package day16_ClassAndObject;

public class EmployeeObject {

	public static void main(String[] args) {


		Employee person1 = new Employee();
		Employee person2 = new Employee();
		Employee person3 = new Employee();
		
		person1.name="Ahmet";
		person1.jobTitle="Manager";
		person1.salary=8500;
		
		System.out.println(person1.name);
		System.out.println(person1.jobTitle);
		System.out.println(person1.salary);
		
		person1.work();
		person1.attendMeeting();
		person1.introduce();
		
		
		
		person2.name="Mehmet";
		person2.jobTitle="Tester";
		person2.salary=4500;
		
		person2.work();
		person2.attendMeeting();
		person2.introduce();
		
		person3.name="Mahmut";
		person3.jobTitle="Developer";
		person3.salary=3000;
		
		person3.work();
		person3.attendMeeting();
		person3.introduce();
		
	}

}
