package assigment3Fix;

public class question3 {

	public static void main(String[] args) {
		

	        
	        int seconds = 6788;
	        
	        
	        if(seconds>=60 && seconds<3600) {
	            System.out.println("the number of minutes in that many seconds.");
	        }else if(seconds>=3600 && seconds<86400) {
	            System.out.println(" the number of hours in that many seconds.");
	        }else if(seconds>=86400) {
	            System.out.println(" the number of days in that many seconds.");
	        }else {
	            System.out.println("it is a just seconds ");
	        }


	}

}
