package day16_ClassAndObject;

public class dogObjects {

	public static void main(String[] args) {


		Dog dog1 = new Dog();
		
		Dog dog2 = new Dog();
		
		Dog dog3 = new Dog();
		
		dog1.age=10;
		dog1.color="Red";
		dog1.breed="Malthese";
		dog1.name="Rower";
		
		
		System.out.println(dog1.age);
		System.out.println(dog1.color);
		System.out.println(dog1.breed);
		
		dog1.barking();
		dog1.hungry();
		dog1.sleeping();
		
		
		
		dog2.age=5;
		dog2.color="Brown";
		dog2.breed="Pitbull";
		dog2.name="Duman";
		
		System.out.println(dog2.age);
		System.out.println(dog2.color);
		System.out.println(dog2.breed);
		
		dog2.barking();
		dog2.hungry();
		dog2.sleeping();
		
		
		dog3.age=2;
		dog3.color="Black";
		dog3.breed="Kangal";
		dog3.name="Karaba$";
		
		System.out.println(dog3.age);
		System.out.println(dog3.color);
		System.out.println(dog3.breed);
		
		dog3.barking();
		dog3.hungry();
		dog3.sleeping();
		
		
	
		

	}

}
