package day36_StaticClassMembers;

public class StudentTest {

	public static void main(String[] args) {

		Student s1= new Student("Mike", 30, 1230); 
		Student s2= new Student("Smith", 35, 999);
		Student s3= new Student("Ozzy", 15, 00001);
		
		//burda dikkatimizi ceken sey tum ogrencilerde okul ayni, 
		//bunu her seferinde tekrar yazmaya gerek yok. Ve okukl adi degisirse tektek hepsini degstrmk lazim
		//class.da String school="Cybertek"; yaparsak herkese otomatik atama yapar
		//test Class daki Cybertekleri ve Classdaki toString.deki String school,u silmemiz lazim
		//eger class.da (static String school="Cybertek") static koyarsak ve Test class.da 
		//s1.school= "Cybertek EU"; yaparsak, sadece s1 degil tum verileri "Cybertek EU" yapar
		//static kendi basina bir class.dir
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		s1.school= "Cybertek EU"; 
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		System.out.println(Student.school); // static old icin Student Class.in 
		
		
		
	}

}
