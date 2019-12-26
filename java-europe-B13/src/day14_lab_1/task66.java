package day14_lab_1;

public class task66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double  distance= distance(1,50);
		
		System.out.println(distance);
		
		if (distance>500) {
			System.out.println("you spend too much gas");
		}else {
			System.out.println("you spend ok gas");
		}
		
	}

	private static double distance(double speed, int time) {

		double distance=speed*time; 
		
		return distance;
		
	}

}
