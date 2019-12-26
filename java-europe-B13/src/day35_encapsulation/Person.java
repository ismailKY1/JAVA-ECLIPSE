package day35_encapsulation;

public class Person {
	
	 private String name;  // sag tik=> source=> Generate getter and setter
	 private int age;
	 private char gender; 
	 	 
	public Person(String name, int age, char gender) {
	
		setName(name);
		setAge(age);
		this.gender = gender;
		
	}
	
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		//condition istersek sart koyabiliriz mesela age icin 0"dan buyuk olmali gibi
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		//condition
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		//condition
		this.age = age;
	} 

}
