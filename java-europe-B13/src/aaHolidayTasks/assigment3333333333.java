package aaHolidayTasks;

public class assigment3333333333 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year=2009; 
		
		int year1= year%4;
		int year2= year%100;
		int year3= year%400; 
		
		
		if ((year1==0&&year2==0)&&year3==0) {
				
				System.out.println(year+ " is a leap year");
				
			}else if (year1==0) {
				System.out.println(year+ " is a leap year");
				
			}else 
				System.out.println(year+ " is not a leap year");
			
		} 
		
		
	}


//Herhangi bir y�l kullan�c� taraf�ndan girilir. Y�l�n art�k y�l olup olmad���n� belirlemek i�in bir program yaz�n.
//Art�k Y�llar, 4'e e�it olarak b�l�nebilen herhangi bir y�ld�r. 100 ile e�it bir �ekilde b�l�nebilen bir y�l, yaln�zca 400 taraf�ndan b�l�nebilen bir art�k y�ld�r.
//
//�rnek :
//1992 Art�k Y�l
//2000 Art�k Y�l
//1900 Art�k Bir Y�l De�il