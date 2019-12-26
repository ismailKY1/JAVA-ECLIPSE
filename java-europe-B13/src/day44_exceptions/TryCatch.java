package day44_exceptions;

public class TryCatch {

	public static void main(String[] args) {
		
		try {
			//check if one link is available (website link)
		
		String str= "JAVA"; 
		
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(5));
		System.out.println(str.charAt(1));
		//ilk satiri yazdi ama 2. satirda hata old icin geri kalan yazmadi 
		//bu kodu simdi try  ve catch icine alacagiz ve bu sekilde hata vermeden sadece uyari verip atlayacak 
		
		}catch (Exception e) {
			//write on excel as a notification saying link not available 
			System.out.println("Exception happened in try block and was cought");
			
		}
		System.out.println("After try catch block");

	}

}
