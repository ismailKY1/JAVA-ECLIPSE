package day20_StringManipulation_Part2;

public class String_indexOf2 {

	public static void main(String[] args) {
		
		
		// index of with 2 value 
		
		String list = "html-selenium-angular-jenkins-grid";
		
		int firstDash=list.indexOf("-");
		System.out.println(firstDash);
		
		int secondDash=list.indexOf("-", 5);  // 5den sonraki dash.i bulur 
		System.out.println(secondDash);

		int thirdDash=list.indexOf("-", secondDash+1); // secondDash sonraki dash
		System.out.println(thirdDash);
		
		int lastDash=list.lastIndexOf("-");   	// sondan baslayarak bulur 
		System.out.println(lastDash);
		
		
	}

}
