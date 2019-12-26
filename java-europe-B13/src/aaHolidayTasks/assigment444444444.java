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
//Telefon faturasý
//Aylýk telefon faturalarýný aþaðýdaki kurallara göre hesaplamak için bir Java programý yazýnýz:
//100 arama için minimum 200 dolar.
//Artý sonraki 50 arama için arama baþýna 0,60 ABD dolarý.
//Artý sonraki 50 arama için arama baþýna 0,50 ABD dolarý.
//Ayrýca 200 çaðrý dýþýnda herhangi bir çaðrý için çaðrý baþýna 0,40 ABD dolarý.