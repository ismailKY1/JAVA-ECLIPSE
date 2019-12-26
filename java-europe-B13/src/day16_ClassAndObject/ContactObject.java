package day16_ClassAndObject;

public class ContactObject {

	public static void main(String[] args) {


		Contact contact1= new Contact();
		
		System.out.println(contact1.email);
		System.out.println(contact1.phoneNumber);
		
		contact1.name= "ismail"; 
		contact1.phoneNumber= "5326460055";
		contact1.email="iskyk.9085@gmail.com";
				
		System.out.println(contact1.name);
		System.out.println(contact1.phoneNumber);
		System.out.println(contact1.email);
		
		contact1.call();
		contact1.sendEmail();
		contact1.sendMessage();
		

	}

}
