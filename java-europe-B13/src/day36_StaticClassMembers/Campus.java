package day36_StaticClassMembers;

public class Campus {

	private String city; 
	static String country; 
	
	static {									// class cagrildiginda 1 kez ve ilk sirada print edecek
		System.out.println("Static Block");
		
	}
	public Campus (String city) {
		System.out.println("Constuctor");
		this.city=city; 
	}
	static {									// class cagrildiginda 1 kez ve ilk sirada print edecek
		System.out.println("Static Block2");
	}
}
