package day44_exceptions;

public class CheckedVSUnchecked {

	public static void main(String[] args) throws InterruptedException {

		try {
			Thread.sleep(2000);  				// tek basina hata verir, try-catch eklemeli ya da selenium gibi 
		} catch (InterruptedException e) {      // bu niye hata veriyor derlerse interview de cvp= checkedException
												// nasil duzeltiriz 2 yol= throws and handle 	
			e.printStackTrace();
		}
		Thread.sleep(3000);
	}

	
}
