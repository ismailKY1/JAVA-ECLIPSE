package day35_encapsulation;

public class EmployeeOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeO e1 = new EmployeO();
		EmployeO e2 = new EmployeO("Mark Jones", 39119);
		EmployeO e3 = new EmployeO("Tedd Britt", 81775, "Sales", "Sales Person");
		
		System.out.println(e1.getName() + "|" + e1.getIdNumber() + "|" + e1.getDepartment() + "|" + e1.getPosition());
		System.out.println(e2.getName() + "|" + e2.getIdNumber() + "|" + e2.getDepartment() + "|" + e2.getPosition());
		System.out.println(e3.getName() + "|" + e3.getIdNumber() + "|" + e3.getDepartment() + "|" + e3.getPosition());
		
		e1.setName("Mike Smith");
		e1.setIdNumber(47889);
		e1.setDepartment("Accounting");
		e1.setPosition("vp");
		
		System.out.println(e1.getName() + "|" + e1.getIdNumber() + "|" + e1.getDepartment() + "|" + e1.getPosition());

	}

}
