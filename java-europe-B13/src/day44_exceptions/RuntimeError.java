package day44_exceptions;

public class RuntimeError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		go();
		

	}

	public static void go() {

		System.out.println("Going");
		go();							// this is "runtime error"... bir sure going print eder sonra hata veriri
		
	}

}
