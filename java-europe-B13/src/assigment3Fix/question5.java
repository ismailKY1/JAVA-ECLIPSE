package assigment3Fix;

public class question5 {

	public static void main(String[] args) {
		
	
		 
		    int weight;
		    
		    weight=8;
		    
		    int miles;
		    
		    miles=300;
		    
		    
		    
		        if(weight<2  ) {
		            
		            if((miles/500)<1) {
		                System.out.println("Your payment is"+ (1.10)*1);
		                
		            }else if((miles/500)>=1) {
		                System.out.println("Your payment is  " +(miles/500*1.10+1.1));
		            }
		            
		        }if(weight>=2 && weight<6 ) {
		            if((miles/500)<1) {
		                System.out.println("Your payment is"+ (1.10)*1);
		                
		            }
		            
		            System.out.println("Your payment is"+ (1*(2.20)));
		        }else if((miles/500)>=1) {
		            if((miles/500)<1) {
		                System.out.println("Your payment is"+ (1.10)*1);
		                
		            }
		            System.out.println("Your payment is  " +(miles/500*2.2+2.2));
		        
		        }if(weight>=6 && weight<10 ) {
		            if((miles/500)<1) {
		                System.out.println("Your payment is"+ (1.10)*1);
		                
		            }
		            System.out.println(1*(3.70));
		        }else if((miles/500)>=1) {
		            System.out.println("Your payment is  " +(miles/500*3.7+3.7));
		        
		        }if(weight>=10) {if((miles/500)<1) {
		            System.out.println("Your payment is"+ (1.10)*1);
		            
		        }
		            System.out.println(1*(3.80));
		        }else if((miles/500)>=1) {
		            System.out.println("Your payment is  " +(miles/500*3.8+3.8));
		            }
		        
		
	}

}
