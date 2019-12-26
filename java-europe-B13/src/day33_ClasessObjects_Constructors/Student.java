package day33_ClasessObjects_Constructors;

public class Student {

	String name; 
	int age; 
	char gender; 
	int year; 
	String course; 
	String university;
	
	// panele sag tik sourche--> Generate constructer use field dedigimixzde kendisi methodlari koyuyor
	
	
	public Student(String name, int age, char gender, int year, String course, String university) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;
		this.university = university;
	} 
	
	public void attendLecture () {
		System.out.println(name+" is attending lecture");
	}
	public void submitAssigment () {
		System.out.println(name+" is submiting Assigment");
	}
	public void attendLab () {
		System.out.println(name+" is attending lab");
	}
	
	
}
