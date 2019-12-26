package day26_ArrayPart3;

public class callStringManipulationArrays {

	public static void main(String[] args) {


		String [] myCars= {"Honda","mercedes","BMW", "Toyota","Ford"}; 
		
		System.out.println(myCars[0].length()); //Honda uzunlugu 5
		System.out.println(myCars[1].charAt(2)); //mercedes in 2. harfi r
		System.out.println(myCars[4].trim());
		System.out.println(myCars[2].substring(2,3)); //2. olan BMW nin 2.harfi W
		System.out.println(myCars[1].equals(myCars[2])); //1. ile 2. ayni mi false
		System.out.println(myCars[1]==myCars[2]); // 1 ile 2 esit mi fslse
		
		
		System.out.println("___________________________________");
		
		for (int i=0; i<myCars.length; i++) {              //DIKKAT ilk lengte parantez yok alttakinde var
			System.out.println(myCars[i].length());			// tum array.larin uzunlugu
		}
		System.out.println("___________________________________");
		
		//split()
		
		String str= "It will display the array of size"; 
		
        
        String[] arr = str.split(" ");
        
        System.out.println(arr.length);
        
        //System.out.println(Arrays.toString(arr));
        
        System.out.println(arr[2]);
        System.out.println(arr[4]);
        
        
        for(String value : arr) {
            
            System.out.println(value);
        }
		
		
		
	}

}
