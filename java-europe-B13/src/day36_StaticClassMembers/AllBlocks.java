package day36_StaticClassMembers;

public class AllBlocks {
	
	public AllBlocks(int x){
		System.out.println("One argument constructor");
	}
	
	public AllBlocks() {
		System.out.println("No argument constructor");
	}
	
	static {							// class cagrildiginda 1 kez ve ilk sirada print edecek			
		System.out.println("First static init");
	}
	
	{									// Instance Blok=>her method cagrildiginda tekrar print eder 
		System.out.println("First instance init");
	}
	
	{
		System.out.println("Second instance init");
	}
	
	static {								// class cagrildiginda 1 kez ve ilk sirada print edecek
		System.out.println("Second static init");
	}

}




