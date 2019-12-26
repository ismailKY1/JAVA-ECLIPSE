package aaHolidayTasks;

public class assignment_2_If_Statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double kilo, pound, meter, inc, height, mass, bmi;
		 
		kilo=70;
		pound=kilo*2.2;
		meter=1.75; 
		inc=meter*39.37;
		
		mass=kilo;
		height=meter;
		
		bmi=mass/(height*height);
		
		System.out.println("BMI= "+bmi);
		
		if(bmi<18.5) {
			System.out.println("Your health risk associated with a BMI value is= Underweight");
			
		}else if(bmi>=18.5 && bmi<25) {
			System.out.println("Your health risk associated with a BMI value is= Normal Weight");
			
		}else if(bmi>=25 && bmi<30) {
			System.out.println("Your health risk associated with a BMI value is= Overweight");
			
		}else if(bmi>=30) {
			System.out.println("Your health risk associated with a BMI value is= Obese");
		}else 
			System.out.println("Wrong Walues");
		
		
		
		
		
	}

}
