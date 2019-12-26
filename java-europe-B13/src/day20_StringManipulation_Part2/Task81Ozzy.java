package day20_StringManipulation_Part2;

public class Task81Ozzy {

	public static void main(String[] args) {

		String time=  "10/10/2019 14:59:00";
		
		System.out.println(timeStamp(time));

	}
	
	public static String timeStamp(String time) {
		time=time.replace("/", "").replace(" ", "").replace(":", "");
	
		return time; 
	}

}
