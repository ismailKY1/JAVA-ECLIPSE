package day20_StringManipulation_Part2;

public class task81 {

	public static void main(String[] args) {

		
		String data= "10/10/2019 14:59:00";
		
		String timeStamp= data.replace("/", "").replace(" ", "").replace(":", "");
		System.out.println(data);
		System.out.println(timeStamp);
		
		
	}

}
