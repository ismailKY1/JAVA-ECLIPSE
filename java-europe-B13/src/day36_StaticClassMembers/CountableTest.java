package day36_StaticClassMembers;

public class CountableTest {

	public static void main(String[] args) {

		int objectCount; 
		
		Countable obj1= new Countable(); 
		Countable obj2= new Countable(); 
		Countable obj3= new Countable(); 
		
		objectCount = obj1.getInstanceCount();
		
		System.out.println(objectCount);
		
		//sonuc 1 cikti, cunku butun Countable.ler ayni methoda basvuruyor
		//eger static int instanceCount=0; bunu yaparsak obj3 (3 tane) old icin sonuc da 3 olacak
		
		
		
	}

}
