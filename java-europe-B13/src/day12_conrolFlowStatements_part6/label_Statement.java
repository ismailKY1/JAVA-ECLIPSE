package day12_conrolFlowStatements_part6;

public class label_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0;
		outer:  					// istedigin ismi koyabilirsin
			do {
				i=8;
				inner:           	 // istedigin ismi koyabilirsin
					while(true) {
						System.out.println(i--);
						if(i==4) {
							continue outer;
						}
					}
			}while(true);


		
	}

}
