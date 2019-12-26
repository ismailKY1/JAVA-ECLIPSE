package a_YOUTUBE_Exercise;

public class continue1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
	int i= 0; 
	
	while (i<10) {  				//bir dongu ile 0-9 arasi yazdirmk istedik. 
		if(i==4||i==7) {
			i++;
			continue; 				// continue ile 4 ve 7 yi yazdirmadan gecmesini istedik

		}
		System.out.println(i);
		i++;
	}
	
	
	}

}
