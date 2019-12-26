package aaHolidayTasks;

public class assigment222222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int income=1500;
		int tax,tax1,tax2,tax3,tax4,tax5;
		
		if(income<=150000000) {
			tax=income*25/100;
			System.out.println("Your Income = " + income+ "\r\n" + 
					"The tax amount you have to pay =" + tax);
			
		}else if(income>150000000&&income<=300000000) {
			tax1=150000000*25/100;
			tax2=(income-150000000)*30/100; 
			System.out.println("Your Income = " + income+ "\r\n" + 
					"The tax amount you have to pay =" + (tax1+tax2));
			
		}else if(income>300000000&&income<=600000000) {
			tax1=150000000*25/100;
			tax2=(150000000)*30/100; 
			tax3=(income-300000000)*35/100;
			System.out.println("Your Income = " + income+ "\r\n" + 
					"The tax amount you have to pay =" + (tax1+tax2+tax3));
			
		}else if(income>600000000&&income<=1200000000) {
			tax1=150000000*25/100;
			tax2=(150000000)*30/100; 
			tax3=(300000000)*35/100;
			tax4=(income-600000000)*40/100;
			System.out.println("Your Income = " + income+ "\r\n" + 
					"The tax amount you have to pay =" + (tax1+tax2+tax3+tax4));
			
		}else if (income>1200000000) {
			tax1=150000000*25/100;
			tax2=(150000000)*30/100; 
			tax3=(300000000)*35/100;
			tax4=(600000000)*40/100;
			tax5=(income-1200000000)*50/100;
			System.out.println("Your Income = " + income+ "\r\n" + 
					"The tax amount you have to pay =" + (tax1+tax2+tax3+tax4+tax5));
			
		}
		
		
		
		
	}

}
