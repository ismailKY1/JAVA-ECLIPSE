package aaHolidayTasks;

import java.util.Scanner;

public class repl_it {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner s = new Scanner(System.in);
	    
	    float f=10;
	    float d=2;
	    String burger="burger";
	    String chicken="chicken";
	    String soda="soda";
	    String in = s.next();
	    
	    if (in.equalsIgnoreCase(burger)||in.equalsIgnoreCase(chicken)){
	      System.out.println(f);
	    }else  if (in.equalsIgnoreCase(soda)){
	      System.out.println(d);
	    }



		
	}

}
