package day34_Constructors_Encapsulation;

public class Floor {
	double width;   // bunlara instnce variable deniyor 
	double lenght;
	
	
	public Floor(double width, double lenght) {

		this.width = width;
		this.lenght = lenght;
		
		if (width<0) {
			this.width=0; 
		}else {
			this.width=width; 
		}
		
		if (lenght<0) {
			this.lenght=0; 
		}else {
			this.lenght=lenght; 
		}
		
	} 
	public double getArea() {
		return this.width*this.lenght; 
	}

}
