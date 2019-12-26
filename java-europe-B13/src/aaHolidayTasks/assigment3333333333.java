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


//Herhangi bir yıl kullanıcı tarafından girilir. Yılın artık yıl olup olmadığını belirlemek için bir program yazın.
//Artık Yıllar, 4'e eşit olarak bölünebilen herhangi bir yıldır. 100 ile eşit bir şekilde bölünebilen bir yıl, yalnızca 400 tarafından bölünebilen bir artık yıldır.
//
//Örnek :
//1992 Artık Yıl
//2000 Artık Yıl
//1900 Artık Bir Yıl Değil