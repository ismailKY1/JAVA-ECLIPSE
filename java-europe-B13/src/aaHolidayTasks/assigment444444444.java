package aaHolidayTasks;

public class assigment444444444 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int call=300;
		
		if(call<=100) {
			System.out.println("Telephone Bill =$200");
			
		}else if (call>100&&call<=150) {
			int plus1=call-100; 
			System.out.println("Telephone Bill =$" + (200+(plus1*0.60)));
		}else if (call>150&&call<=200) {
			int plus2=call-150; 
			System.out.println("Telephone Bill =$" + (230+(plus2*0.50)));
		}else if (call>200) {
			int plus3=call-200; 
			System.out.println("Telephone Bill =$" + (255+(plus3*0.40)));
		}
		
		
		
		

	}

}

//285/5000
//Telefon faturas�
//Ayl�k telefon faturalar�n� a�a��daki kurallara g�re hesaplamak i�in bir Java program� yaz�n�z:
//100 arama i�in minimum 200 dolar.
//Art� sonraki 50 arama i�in arama ba��na 0,60 ABD dolar�.
//Art� sonraki 50 arama i�in arama ba��na 0,50 ABD dolar�.
//Ayr�ca 200 �a�r� d���nda herhangi bir �a�r� i�in �a�r� ba��na 0,40 ABD dolar�.