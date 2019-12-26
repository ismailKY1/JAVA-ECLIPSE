package assigment3Fix;

public class question4 {

	public static void main(String[] args) {

  
	        double quantity= 90;
	        
	        double  price = 99;
	        
	        double discount;
	        
	        double total;
	        
	        if(quantity>10 && quantity<19) {
	            
	            discount = quantity*price*(0.20); 
	            
	            total = quantity*price-discount;
	            
	            System.out.println(" your total is : " + total + " after your discount "+ discount);
	           
	        }else if(quantity>20 && quantity<49) {
	            
	            discount = quantity*price*(0.30); 
	            
	            total = quantity*price-discount;
	            
	            System.out.println(" your total is : " + total + " after your discount "+ discount);
	        
	        
	        }else if(quantity>50 && quantity<99) {
	            
	            discount = quantity*price*(0.40); 
	            
	            total = quantity*price-discount;
	            
	            System.out.println(" your total is : " + total + " after your discount "+ discount);
	        
	        }else if (quantity>100) {
	            
	            discount = quantity*price*(0.50); 
	            
	            total = quantity*price-discount;
	            
	            System.out.println(" your total is : " + total + " after your discount "+ discount);
	        
	        }else {
	            
	            System.out.println("this quantity does not have any discount !!");
	        }

	}

}
