package day26_ArrayPart3;

public class Task_HowManyWords {

	public static void main(String[] args) {

		String str = "As he crossed toward the pharmacy at the corner he involuntarily turned his head because of a burst of light that had ricocheted from his temple, and saw, with that quick smile with which we greet a rainbow or a rose, a blindingly white parallelogram of sky being unloaded from the van a dresser with mirrors across which, as across a cinema screen, passed a flawlessly clear reflection of boughs sliding and swaying not arboreally, but with a human vacillation, produced by the nature of those who were carrying this sky, these boughs, this gliding façade.";
		String[] array=str.split(" ");       //cumlede kac kelime var
		System.out.println(array.length);
		
		for(String value:array) {            //tum kelimeleri alt alta ayirdik 
			System.out.println(value);
		}
		System.out.println(array[22]);      //22.kelimeyi yazar XX ama 0"dan baslar unutma XX

        // System.out.println(array.toString(array)); tum kelimeleri array formatinda yazar. 
	}

}
